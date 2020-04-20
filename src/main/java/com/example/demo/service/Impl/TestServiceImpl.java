package com.example.demo.service.Impl;

import com.example.demo.mapper.one.OneMapper;
import com.example.demo.mapper.two.TwoMapper;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date 2020/4/20 13:57
 * @Author 86131
 * @Description
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private OneMapper oneMapper;
    @Autowired
    private TwoMapper twoMapper;


    @Override
    public Map<String, Object> getByChannel(Integer type) {
        Map<String, Object> map = new HashMap<>(16);

        switch (type) {
            case 1:
                map.put("result", oneMapper.userInfoList());
                break;
            case 2:
                map.put("result", twoMapper.messageInfoList());
            default:
                break;
        }
        return map;
    }
}

package com.example.demo.mapper.two;

import com.example.demo.vo.MessageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Date 2020/4/20 13:45
 * @Author 86131
 * @Description
 */
@Mapper
public interface TwoMapper {
    List<MessageInfo> messageInfoList();
}

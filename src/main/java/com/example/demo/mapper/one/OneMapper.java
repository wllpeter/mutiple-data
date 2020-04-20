package com.example.demo.mapper.one;

import com.example.demo.vo.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Date 2020/4/20 13:44
 * @Author 86131
 * @Description
 */
@Mapper
public interface OneMapper {
    List<UserInfo> userInfoList();
}

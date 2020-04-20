package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Date 2020/4/20 13:54
 * @Author 86131
 * @Description
 */
@RestController
@RequestMapping(value = "/channel")
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping("/{type}")
    public Object getByChannel(@PathVariable(value = "type") Integer type) {
        return testService.getByChannel(type);
    }

}

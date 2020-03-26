package com.ityb.microservice.demo.user.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by viruser on 2020/3/6.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/queryUser")
    public String queryUser(){
        return "我是一个用户"+ new Random().nextInt(100);
    }
}

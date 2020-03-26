package com.ityb.microservice.demo.web.controller;

import com.ityb.microservice.demo.web.remoting.UserRemoting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viruser on 2020/3/6.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserRemoting userRemoting;

    @RequestMapping("/queryUser")
    public String queryUser(){
        return userRemoting.queryUser();
    }

}

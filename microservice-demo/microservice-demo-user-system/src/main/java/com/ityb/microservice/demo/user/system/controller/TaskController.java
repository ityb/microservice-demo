package com.ityb.microservice.demo.user.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by viruser on 2020/3/9.
 */
@RequestMapping("/task")
@RestController
public class TaskController {

    @RequestMapping("/queryTask")
    public String queryTask(){
        return "我是一个任务"+ new Random().nextInt(100);
    }

}

package com.ityb.miroservice.demo.platform.controller;

import com.ityb.miroservice.demo.platform.remoting.TaskRemoting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by viruser on 2020/3/9.
 */
@RequestMapping("/task")
@RestController
public class TaskController {

    @Autowired
    private TaskRemoting taskRemoting;

    @RequestMapping("/queryTask")
    public String queryTask(){
        return this.taskRemoting.queryTask();
    }
}

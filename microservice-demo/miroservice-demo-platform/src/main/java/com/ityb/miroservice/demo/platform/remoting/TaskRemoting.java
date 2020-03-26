package com.ityb.miroservice.demo.platform.remoting;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by viruser on 2020/3/9.
 */
@FeignClient(value = "microservice-demo-user-system")
public interface TaskRemoting {

    @PostMapping("/task/queryTask")
    String queryTask();
}

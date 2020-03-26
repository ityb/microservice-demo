package com.ityb.microservice.demo.web.remoting;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by viruser on 2020/3/6.
 */
@FeignClient(value = "microservice-demo-user-system")
public interface UserRemoting {

    @PostMapping("/user/queryUser")
    String queryUser();
}

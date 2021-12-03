package com.example.vehicle.core.controller;

import com.example.vehicle.auth.facade.UserApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Johnny
 */
@RestController
@RequestMapping("biz")
public class BizController {

    @DubboReference //rpc
    private UserApi userApi;

    @GetMapping("test")
    public String testBiz(String name) {
        return userApi.sayHello(name);
    }
}

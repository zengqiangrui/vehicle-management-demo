package com.example.vehicle.auth.controller;

import com.example.vehicle.auth.domain.UserDomain;
import com.example.vehicle.auth.facade.UserApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Johnny
 */
@RestController
@RequestMapping("user")
public class UserController implements UserApi {
    @Resource
    UserDomain userDomain;

    @GetMapping
    public String sayHello(String name) {
        return userDomain.sayHello(name);
    }

}

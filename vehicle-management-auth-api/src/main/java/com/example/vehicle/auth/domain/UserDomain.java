package com.example.vehicle.auth.domain;

import com.example.vehicle.auth.facade.UserApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * @author Johnny
 */
@DubboService
@Service
public class UserDomain implements UserApi {
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}

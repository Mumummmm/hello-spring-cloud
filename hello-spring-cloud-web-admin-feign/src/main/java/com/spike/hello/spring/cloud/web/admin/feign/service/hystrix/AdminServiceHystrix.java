package com.spike.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.spike.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return String.format("hi, message is %s, but error", message);
    }
}

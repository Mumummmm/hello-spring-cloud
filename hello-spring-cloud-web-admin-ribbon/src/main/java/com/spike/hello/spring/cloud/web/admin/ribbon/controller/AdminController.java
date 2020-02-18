package com.spike.hello.spring.cloud.web.admin.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spike.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    private AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        return adminService.sayHi(message);
    }

    public String hiError(String message) {
        return String.format("hi, you message is %s, but error", message);
    }
}

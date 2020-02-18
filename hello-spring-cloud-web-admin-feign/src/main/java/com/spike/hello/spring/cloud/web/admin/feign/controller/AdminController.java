package com.spike.hello.spring.cloud.web.admin.feign.controller;

import com.spike.hello.spring.cloud.web.admin.feign.service.AdminService;
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
    public String sayHi(String message) {
        return adminService.sayHi(message);
    }
}

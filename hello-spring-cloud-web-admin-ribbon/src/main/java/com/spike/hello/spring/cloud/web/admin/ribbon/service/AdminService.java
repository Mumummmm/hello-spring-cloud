package com.spike.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    private final RestTemplate restTemplate;

    public AdminService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String sayHi(String message) {
        String result = restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message=" + message, String.class);
        System.out.println("1");
        return result;
    }
}

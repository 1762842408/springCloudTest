package com.lj.controller;

import com.lj.entity.Student;
import com.lj.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignService.findAll();
    };

    @GetMapping("/port")
    public String port(){
        return feignService.port();
    };
}

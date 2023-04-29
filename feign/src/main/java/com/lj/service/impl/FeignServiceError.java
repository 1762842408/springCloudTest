package com.lj.service.impl;

import com.lj.entity.Student;
import com.lj.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignServiceError implements FeignService {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String port() {
        return "服务器维护中……";
    }
}

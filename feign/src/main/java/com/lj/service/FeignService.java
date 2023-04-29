package com.lj.service;

import com.lj.entity.Student;
import com.lj.service.impl.FeignServiceError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeignServiceError.class)
public interface FeignService {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/port")
    String port();
}

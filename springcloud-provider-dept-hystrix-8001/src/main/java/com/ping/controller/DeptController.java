package com.ping.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ping.pojo.Dept;
import com.ping.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//提供Restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept getDept(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if(dept == null){
            throw new RuntimeException("id=>"+id+",不存在该用户，或者信息无法找到~");
        }
        return dept;
    }

    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept()
                .setDeptno(id)
                .setDeptname("id=>"+id+"没有对应的信息，null--@Hystrix")
                .setDb_source("no this database in MySQL");
    }
}

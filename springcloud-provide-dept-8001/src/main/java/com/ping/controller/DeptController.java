package com.ping.controller;

import com.ping.pojo.Dept;
import com.ping.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//提供Restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        System.out.println(dept.getDeptname()+"=============================");
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> addDept(){
        return deptService.queryAll();
    }


}

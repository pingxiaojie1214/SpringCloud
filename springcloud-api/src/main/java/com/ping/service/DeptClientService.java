package com.ping.service;

import com.ping.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//默认集成了ribbon,由于多了一层，效果没另一个好。
@Component
@FeignClient(value="springcloud-provider-dept")
public interface DeptClientService {

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<Dept> list();
}

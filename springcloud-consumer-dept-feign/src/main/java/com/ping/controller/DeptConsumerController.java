package com.ping.controller;

import com.ping.pojo.Dept;
import com.ping.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {
    //消费者不应该有service层
    //RestTemplate ... 供我们调用就可以了！注册到Spring中。
    //参数可以用map封装，可以用实体传过去，可以写在地址里。

    @Autowired
    private DeptClientService service = null;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        System.out.println(dept.getDeptname()+"=============================");
        return service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return service.getDept(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(){
        return service.list();
    }
}

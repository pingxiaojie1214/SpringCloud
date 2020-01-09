package com.ping.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法
public class Dept implements Serializable{
    private long deptno;

    private String deptname;

    //这条数据存在哪个数据库，一个服务对应一个数据库，同一个信息可能不在不同的数据库。
    private String  db_source;


    public Dept(String deptname) {
        this.deptname = deptname;
    }

    /**
     * 链式写法
     * Dept dept = new Dept();
     * dept.setDeptNo(1).setDeptname("开发部");
     */
}

package com.lv.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor
@Accessors(chain = true)// 链式写法
public class Dept implements Serializable {
    // 实体类必须实现序列化
    // orm类表关系映射
    private Long deptno;
    private String dname;
    // 微服务一个服务对应一个数据库；同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }
    /*
    链式写法：支持
    Dept dept = new Dept();
    dept.setDeptNo(11).setDname(11).setDb source()
     */
}

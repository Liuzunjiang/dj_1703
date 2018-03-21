package com.dj.springboot.controller;

import com.dj.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

    @Autowired
    private User user;

    @Value("${com.dj.name}")
    private String name;

    @Value("${com.dj.age}")
    private Integer age;

    @RequestMapping("/index")
    public String index() {
        System.out.println(name + "-" + age);
        System.out.println(user.getName() + "-" + user.getAge()+ "-" + user.getSex()+ "-" + user.getClassroom()+ "-" + user.getPwd());
        return "test";
    }


}

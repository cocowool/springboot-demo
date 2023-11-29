package cn.edulinks.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class demo {
    @GetMapping("hello")
    public String hello(){
        return "This is springboot application demo.";
    }
}

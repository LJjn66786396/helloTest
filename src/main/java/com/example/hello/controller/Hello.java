package com.example.hello.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
//        System.out.println("hello world");
        return "hello world";
    }
}
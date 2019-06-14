package com.chowi.jenkins_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @RequestMapping(value = "say")
    @ResponseBody
    public String sayHello(){
        return "Hi! Jenkins";
    }

    @RequestMapping(value = "sing")
    @ResponseBody
    public String sing(){
        return "la la la la la~~~";
    }

    @RequestMapping(value = "fuck")
    @ResponseBody
    public String fuck(){
        return "u mother fly";
    }
}

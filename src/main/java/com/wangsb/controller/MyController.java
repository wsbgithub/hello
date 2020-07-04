package com.wangsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "欢迎使用Springmvc");
        modelAndView.addObject("fun", "requestMapping()");
        modelAndView.setViewName("show");
        System.out.println("测试git");
        System.out.println("第二天测试,我来看看能不能上传到远程服务器");
        return modelAndView;
    }
}

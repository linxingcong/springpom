package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/cls")
public class ClassController {
    @Autowired
    private RestTemplate resetTemplate;
    @RequestMapping("/queryClassStudent")
    @ResponseBody
    public String queryClassStudent(){
        System.out.println("查询班级的所有学生信息");
        String result =resetTemplate.getForObject("http://web-student/stu/list",String.class);
        System.out.println("调用学生微服务的返回结果"+result);
        return "result:"+result;
    }

}

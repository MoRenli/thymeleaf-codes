package com.lkjedu.boot.controller;

import com.lkjedu.boot.ov.School;
import com.lkjedu.boot.ov.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExpressionVar1Demo02 {
    @RequestMapping("/var1")
    public String expression(Model model){
        model.addAttribute("MyName","lisi");
        model.addAttribute("MyAge",20);

        Student student = new Student();
        School school = new School();
        school.setSchoolName("尚硅谷");
        school.setAddress("北京昌平区科技园");
        student.setName("wangwu");
        student.setId(1001);
        student.setEmail("wangwu@qq.com");
        student.setAge(20);
        student.setMySchool(school);
        model.addAttribute("student",student);
        model.addAttribute("school",school);
        return "var1";
    }
}

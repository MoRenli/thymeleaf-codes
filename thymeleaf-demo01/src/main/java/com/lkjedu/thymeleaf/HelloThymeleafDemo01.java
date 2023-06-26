package com.lkjedu.thymeleaf;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

public class HelloThymeleafDemo01 {
    public static void main(String[] args) {
        //创建模板引擎
        TemplateEngine templateEngine = new TemplateEngine();
        //准备模板
        String input = "<input type='text' th:value='HelloThymeleaf'></input>";
        //准备数据，使用Context
        Context context = new Context();
        //调用引擎处理模板和数据
        String process = templateEngine.process(input, context);
        System.out.println("结果数据:"+process);
    }
}

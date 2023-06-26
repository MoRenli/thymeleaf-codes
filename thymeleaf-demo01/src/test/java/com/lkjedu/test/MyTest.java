package com.lkjedu.test;


import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class MyTest {
    /**
     * 测试模板引擎读取磁盘中的模板文件
     * */
    @Test
    public void t1(){
        TemplateEngine templateEngine = new TemplateEngine();
        //读取磁盘中的模板文件
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        //设置模板引擎的为：Resolver
        templateEngine.setTemplateResolver(templateResolver);
        //指定数据
        Context context = new Context();
        context.setVariable("name","lkj");
        //处理模板
        String process = templateEngine.process("template/main.html", context);
        System.out.println(process);
    }
    /**
     * 设之我们模板引擎的路径(前缀\后缀)
     */
    @Test
    public void t2(){
        TemplateEngine templateEngine = new TemplateEngine();
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        //设置前缀(必须指定在resource资源文件下)
        templateResolver.setPrefix("template/");
        //设置后缀
        templateResolver.setSuffix(".html");

        templateEngine.setTemplateResolver(templateResolver);

        Context context = new Context();
        context.setVariable("name","lkj");
        String process = templateEngine.process("main.html", context);
        System.out.println(process);
    }
}

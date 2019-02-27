package com.school.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value ="file:D:\\datasource.properties",encoding="utf-8")//读取数据库连接的配置文件
@SpringBootApplication //如果不使用(scanBasePackages = "com.crm")将无法创建service层到application中BaseDictController.class会报错 (scanBasePackages = "com.school")


public class Application {
    public static void main(String[] args) { SpringApplication.run(Application.class, args); }
}

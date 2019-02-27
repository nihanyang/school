package com.school.web.controller;



import com.school.dao.mapper.school.Student01DOMapper;
import com.school.dao.model.school.Student01DO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class TestController {
    @Autowired
    Student01DOMapper student01DOMapper;


    //班级数据
    String[] theclass ={"一年级1班","一年级2班","一年级3班","一年级4班"};

   public String makeTheClass() {
       String newclass = "";
       int i = (int) (Math.random()*theclass.length);
       newclass = theclass[i];
       return  newclass;
   }
    @Test
    public void makeClassForStudent() {
        Student01DO s = new Student01DO();//创建实体类
        for(int i = 521; i> 19 ; i--) {
            student01DOMapper.updateTheClassName(makeTheClass(),i);
        }
    }



}

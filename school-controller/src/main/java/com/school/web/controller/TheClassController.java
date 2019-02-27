package com.school.web.controller;


import com.school.dao.mapper.school.TheClassDOMapper;
import com.school.dao.model.school.TheClassDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TheClassController {
    @Autowired
    TheClassDOMapper theClassDOMapper;


    @GetMapping("/theclass/{id}")
    public TheClassDO getDepartment(@PathVariable("id") int id){
        return theClassDOMapper.selectByPrimaryKey(id);
    }


}

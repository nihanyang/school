package com.school.dao.mapper.school;

import com.school.dao.model.school.TeacherTheClassDO;

public interface TeacherTheClassDOMapper {
    int insert(TeacherTheClassDO record);

    int insertSelective(TeacherTheClassDO record);
}
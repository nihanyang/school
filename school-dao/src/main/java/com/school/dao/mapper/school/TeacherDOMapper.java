package com.school.dao.mapper.school;

import com.school.dao.model.school.TeacherDO;

public interface TeacherDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherDO record);

    int insertSelective(TeacherDO record);

    TeacherDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherDO record);

    int updateByPrimaryKey(TeacherDO record);
}
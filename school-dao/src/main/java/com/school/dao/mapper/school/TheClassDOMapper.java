package com.school.dao.mapper.school;

import com.school.dao.model.school.TheClassDO;

public interface TheClassDOMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(TheClassDO record);

    int insertSelective(TheClassDO record);

    TheClassDO selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(TheClassDO record);

    int updateByPrimaryKey(TheClassDO record);
}
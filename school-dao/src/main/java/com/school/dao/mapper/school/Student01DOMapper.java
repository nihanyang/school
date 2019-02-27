package com.school.dao.mapper.school;

import com.school.dao.model.school.Student01DO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Student01DOMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Student01DO record);

    int insertSelective(Student01DO record);

    Student01DO selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Student01DO record);

    int updateByPrimaryKey(Student01DO record);

    /*@Update("UPDATE student01 SET the_class_name = #{name} WHERE s_id = #{id}");
    int getMaxId(@Param("cId")int cId);*/
    @Update("UPDATE student01 SET the_class_name = #{name} WHERE s_id = #{id}")
    int updateTheClassName(@Param("name")String name,@Param("id")int id);
}
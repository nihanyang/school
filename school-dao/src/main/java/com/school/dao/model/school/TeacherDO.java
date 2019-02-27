package com.school.dao.model.school;

public class TeacherDO {
    private Integer id;

    private String name;

    public TeacherDO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public TeacherDO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
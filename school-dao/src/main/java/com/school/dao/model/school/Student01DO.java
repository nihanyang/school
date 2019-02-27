package com.school.dao.model.school;

public class Student01DO {
    private Integer sId;

    private String name;

    private Integer age;

    private String theClassName;

    public Student01DO(Integer sId, String name, Integer age, String theClassName) {
        this.sId = sId;
        this.name = name;
        this.age = age;
        this.theClassName = theClassName;
    }

    public Student01DO() {
        super();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTheClassName() {
        return theClassName;
    }

    public void setTheClassName(String theClassName) {
        this.theClassName = theClassName == null ? null : theClassName.trim();
    }
}
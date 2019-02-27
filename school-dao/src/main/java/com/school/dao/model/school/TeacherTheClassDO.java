package com.school.dao.model.school;

public class TeacherTheClassDO {
    private String tName;

    private String cName;

    public TeacherTheClassDO(String tName, String cName) {
        this.tName = tName;
        this.cName = cName;
    }

    public TeacherTheClassDO() {
        super();
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }
}
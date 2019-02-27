package com.school.dao.model.school;

public class TheClassDO {
    private Integer tId;

    private String name;

    public TheClassDO(Integer tId, String name) {
        this.tId = tId;
        this.name = name;
    }

    public TheClassDO() {
        super();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
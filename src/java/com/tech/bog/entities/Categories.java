package com.tech.bog.entities;

public class Categories 
{
    private int cid;
    private String name;
    private String description;
    private String ctype;

    public Categories(int cid, String name, String description, String ctype) {
        this.cid = cid;
        this.name = name;
        this.description = description;
        this.ctype = ctype;
    }

    public Categories() {
    }

    public Categories(String name, String description, String ctype) {
        this.name = name;
        this.description = description;
        this.ctype = ctype;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
    
}

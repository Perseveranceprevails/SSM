package com.relation.pojo;

import java.io.Serializable;
import java.util.List;

public class Teacher implements Serializable{

    private Integer id;
    private Integer tid;
    private String tname;
    private List<Teacher> teachers;


    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", tid=" + tid +
                ", tname='" + tname + '\'' +
                ", teachers=" + teachers +
                '}';
    }

    public Teacher() {
    }

    public Teacher(Integer id, Integer tid, String tname, List<Teacher> teachers) {
        this.id = id;
        this.tid = tid;
        this.tname = tname;
        this.teachers = teachers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}

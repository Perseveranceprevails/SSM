package com.relation.pojo;


import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable{

  private Integer sid;
  private String sname;
  private Integer age;
  private Set<Teacher> teachers;


  @Override
  public String toString() {
    return "Student{" +
            "sid=" + sid +
            ", sname='" + sname + '\'' +
            ", age=" + age +
            ", teacherSet=" + teachers +
            '}';
  }

  public Student() {
  }

  public Student(Integer sid, String sname, Integer age, Set<Teacher> teacherSet) {
    this.sid = sid;
    this.sname = sname;
    this.age = age;
    this.teachers = teacherSet;
  }

  public Set<Teacher> getTeacherSet() {
    return teachers;
  }

  public void setTeacherSet(Set<Teacher> teacherSet) {
    this.teachers = teacherSet;
  }

  public long getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public long getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

}

package com.relation.pojo;


import java.io.Serializable;
import java.util.Set;

public class Teacher implements Serializable{

  private Integer tid;
  private String tname;
  private Set<Student> students;


  @Override
  public String toString() {
    return "Teacher{" +
            "tid=" + tid +
            ", tname='" + tname + '\'' +
            ", students=" + students +
            '}';
  }

  public Teacher(Integer tid, String tname, Set<Student> students) {
    this.tid = tid;
    this.tname = tname;
    this.students = students;
  }

  public Teacher() {
  }

  public Set<Student> getStudents() {
    return students;
  }

  public void setStudents(Set<Student> students) {
    this.students = students;
  }

  public long getTid() {
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

}

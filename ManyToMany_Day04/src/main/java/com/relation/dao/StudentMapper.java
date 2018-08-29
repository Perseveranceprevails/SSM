package com.relation.dao;

import com.relation.pojo.Student;
import com.relation.pojo.Teacher;

import java.io.Serializable;

public interface StudentMapper {


    /**
     * 根据学生Id 查找学生信息
     */
    Student findStudentBySid(Serializable sid);


    /**
     * 根据老师Id 查找老师信息
     */
    Teacher findTeacherBySid(Serializable tid);

}

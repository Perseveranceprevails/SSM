package com.page.dao;

import com.page.pojo.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentMapper {


    /**
     * 根据学生ID查找学生信息
     */
    List<Student> findStudetnByPage();


}

package com.cache.dao;

import com.cache.pojo.Student;

import java.io.Serializable;

public interface StudetnMapper {


    /**
     * 根据学生ID查找学生信息
     */
    Student findStudetnBySid(Serializable sid);


    /**
     * 根据学生Id修改学生信息
     */
    int updateStudetnBySid(Serializable sid);

}

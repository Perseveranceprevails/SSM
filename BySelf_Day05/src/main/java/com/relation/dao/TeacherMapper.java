package com.relation.dao;

import com.relation.pojo.Teacher;

import java.io.Serializable;
import java.util.List;

public interface TeacherMapper {


    /**
     * 根据老师Id查找老师信息
     *
     * @return
     */
    List<Teacher> findTeacherBytid(Serializable id);

}

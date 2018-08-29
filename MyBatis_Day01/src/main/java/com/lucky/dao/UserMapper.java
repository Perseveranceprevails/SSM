package com.lucky.dao;

import com.lucky.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    //登录方法
    int login(@Param("name") String userName, @Param("pwd") String password);


    //根据条件查询
    Users findByCondition(@Param("MyId") int id, @Param("MyName") String userName, @Param("MyPwd") String password);

    //查询所有
    List<Users> selectEach();


    int deleteByCondition(Users users);


    Users login2(String userName, String password);

    int update(@Param("NewName") String name, @Param("NewPwd") String password, @Param("OldId") int id);

    //添加
    int insert(Users users);

    Users dynamicSql(Users users);

    int updateBySet(Users users);

    List<Users> selectByTrim(Users users);


    int updateByTrim(Users users);

    List<Users> selectBychoose(Users users);

    List<Users> selectByArray(int[] ids);

    List<Users> selectByList(List<Integer> list);

    List<Users> selectByListUsers(List<Users> list);

    int insertByListUsers(List<Users> users);

    List<Users> selectByMap(@Param("myMap") Map<String, Integer> map);

    List<Users> selectByMapUsers(@Param("myMap") Map<String, Users> map);
}

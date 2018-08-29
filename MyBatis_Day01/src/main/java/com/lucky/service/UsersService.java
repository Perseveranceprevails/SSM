package com.lucky.service;

import com.lucky.dao.UserMapper;
import com.lucky.pojo.Users;
import com.lucky.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsersService {

    SqlSession session=null;
    UserMapper mapper=null;
    //获取session
    public void getSession(){
        session = MyBatisUtil.getFactory().openSession();
        mapper=session.getMapper(UserMapper.class);
    }

    //关闭session
    public void clossSession(){
        session.commit();
        session.close();
    }


    /**
     * 登录方法
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    public int login(String userName, String password) {
        int count=0;
        getSession();
        count=mapper.login(userName,password);
        clossSession();
        return count;
    }


    /**
     * 查询单个对象方法
     * @param id  用户Id
     * @param userName 用户名
     * @return
     */
    public Users findByCondition(int id, String userName,String password) {
        Users users=null;
        getSession();
        users=mapper.findByCondition(id,userName,password);
        clossSession();
        return users;
    }

    public List<Users> selectEach() {
        List<Users> list=new ArrayList<>();
        getSession();
        list=mapper.selectEach();
        clossSession();
        return list;
    }


    //根据条件修改
    public int deleteByCondition(Users users) {
        int count=0;
        getSession();
        count=mapper.deleteByCondition(users);
        clossSession();
        return count;
    }

    //登录
    public Users login2(String userName, String password) {
        Users users=new Users();
        getSession();
        users=mapper.login2(userName,password);
        clossSession();
        return users;
    }

    //根据条件修改
    public int update(String name, String password, int id) {

        int count=0;
        getSession();
        count=mapper.update(name,password,id);
        clossSession();
        return count;
    }


    //添加方法
    public int insert(Users users){
        int count=0;
        getSession();
        count=mapper.insert(users);
        clossSession();
        return count;
    }


    //动态Sql where-if
    public Users dynamicSql(Users users) {
        getSession();
        return mapper.dynamicSql(users);
    }

    //动态SQL set-if
    public int updatebySet(Users users) {
        getSession();
        int count=mapper.updateByTrim(users);
        clossSession();
        return count;
    }


    public List<Users> selectByTrim(Users users) {
        getSession();
        return mapper.selectByTrim(users);
    }

    public int updateByTrim(Users users) {

        getSession();
        int count=mapper.updateByTrim(users);
        clossSession();
        return count;
    }

    public List<Users> selectBychoose(Users users) {
        getSession();
        List<Users> list=mapper.selectBychoose(users);
        clossSession();
        return list;
    }

    public List<Users> selectByArray(int[] ids) {
        getSession();
        return mapper.selectByArray(ids);
    }

    public List<Users> selectByList(List<Integer> list) {
        getSession();
        return mapper.selectByList(list);
    }

    public List<Users> selectByListUsers(List<Users> list) {
        getSession();
        return mapper.selectByListUsers(list);
    }

    public int insertByListUsers(List<Users> users) {

        getSession();
        int count=mapper.insertByListUsers(users);
        clossSession();
        return count;

    }

    public List<Users> selectByMap(Map<String, Integer> map) {
        getSession();
        return mapper.selectByMap(map);
    }

    public List<Users> selectByMapUsers(Map<String, Users> map) {
        getSession();
        return mapper.selectByMapUsers(map);
    }
}

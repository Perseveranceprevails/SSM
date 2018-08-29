package com.lucky;

import com.lucky.pojo.Users;
import com.lucky.service.UsersService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    UsersService service=new UsersService();

    @Test
    public  void Test01(){
        Users users=new Users();
        users.setName("大漂亮");
        users.setPassword("admin");
        int insert = service.insert(users);
        System.out.println(users.getId());
    }


    /**
     * 动态Sql  where-if
     */
    @Test
    public void Test02(){
        Users users=new Users();
        users.setId(1);
        users=service.dynamicSql(users);
        System.out.println(users);
    }


    /**
     * 动态sql set-if
     */
    @Test
    public void Test03(){
        Users users = new Users();
        users.setId(1);
        users.setName("花花");
        int count=service.updatebySet(users);
        System.out.println(count);
    }


    /**
     * 动态Sql select-trim-if
     */
    @Test
    public void Test04(){
        Users users=new Users();
        users.setName("小");
        List<Users> list=service.selectByTrim(users);
        System.out.println(list);
    }

    /**
     * 动态Sql update-trim-if
     */
    @Test
    public void Test05(){
        Users users=new Users();
        users.setName("马大头");
        int count=service.updateByTrim(users);
        System.out.println(count);
    }

    /**
     * 动态Sql select-
     */
    @Test
    public void Test06(){
        Users users=new Users();
        users.setPassword("1");
        List<Users> list=service.selectBychoose(users);
        System.out.println(list);
    }


    /**
     * 动态Sql遍历数组
     */
    @Test
    public void testByArray(){
        int [] ids={1,2};
        List<Users> list=service.selectByArray(ids);
        System.out.println(list);
    }


    /**
     * 动态Sql 遍历集合
     */
    @Test
    public void testByList(){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Users> list1=service.selectByList(list);
        System.out.println(list1);
    }

    /**
     * 动态Sql 遍历对象集合
     */
    @Test
    public void testByListUsers(){
        List<Users> list=new ArrayList<>();
        Users u1=new Users(1);
        Users u2=new Users(4);
        Users u3=new Users(6);
        list.add(u1);
        list.add(u2);
        list.add(u3);

        List<Users> list1=service.selectByListUsers(list);
        System.out.println(list1);
    }


    /**
     * 动态Sql  遍历对象集合添加信息
     */
    @Test
    public void insertByListUsers(){
        List<Users> users=new ArrayList<>();
        Users u1=new Users();
        u1.setName("豆豆");
        u1.setPassword("123");
        users.add(u1);
        Users u2=new Users();
        u2.setName("亲");
        u2.setPassword("456");
        users.add(u2);
        int result=service.insertByListUsers(users);
        System.out.println(result);
    }

    /**
     * 动态Sql 遍历Map查找
     *
     */
    @Test
    public void testByMap(){
        Map<String,Integer> map=new HashMap<>();
        map.put("Key1",1);
        map.put("Key2",3);
        map.put("Key3",5);
        List<Users> list=service.selectByMap(map);
        System.out.println(list);
    }

    /**
     * 动态Sql 遍历对象Map查找
     *
     */
    @Test
    public void testByUsersMap(){
        Users u1=new Users(2);
        Users u2=new Users(4);
        Users u3=new Users(6);
        Map<String,Users> map=new HashMap<>();
        map.put("key1",u1);
        map.put("key2",u2);
        map.put("key3",u3);
        List<Users> list=service.selectByMapUsers(map);
        System.out.println(list);
    }

}

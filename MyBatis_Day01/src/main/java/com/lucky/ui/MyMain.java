package com.lucky.ui;

import com.lucky.pojo.Users;
import com.lucky.service.UsersService;
import com.lucky.pojo.Users;
import com.lucky.service.UsersService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {

    static Scanner input=new Scanner(System.in);

    static UsersService service=new UsersService();

    static Users loginUser=new Users();

    public static void main(String[] args) {
        login();
        //function();

    }

    private static void login() {

        System.out.println("请输入用户名：");
        String userName=input.next();
        System.out.println("请输入密码：");
        String password=input.next();
        Users users=new Users();
        users=service.login2(userName,password);
        if(users!=null){
            loginUser.setId(users.getId());
            function();
        }else{
            System.out.println("用户名或密码错误");
        }
    }

    private static void function() {
        System.out.println("请选择需要的业务：");
        System.out.println("1.查询 2.删除 3.修改 ");
        int num=input.nextInt();
        switch (num){
            case 1:
                select();
                break;
            case 2:
                delete();
                break;
            case 3:
                update();
                break;
            default:

                break;
        }
    }

    private static void update() {

        System.out.println("输入修改后的用户名：");
        String name=input.next();
        System.out.println("输入修改后的密码：");
        String password=input.next();
        int count=service.update(name,password,loginUser.getId());
        if(count>0){
            System.out.println("修改成功");
            login();
        }else{
            System.out.println("修改失败");
        }
    }

    private static void delete() {
        int id=0;
        String userName=null;
        String password=null;
        int count=0;

        System.out.println("选择删除的条件：1.ID 2.用户名 3.密码");
        int num=input.nextInt();
        switch (num){
            case 1:
                System.out.println("请输入要删除信息的ID：");
                id=input.nextInt();
                isTrue(id,userName,password);
                break;
            case 2:
                System.out.println("请输入要删除信息的用户名：");
                userName=input.next();
                isTrue(id,userName,password);
                break;
            case 3:
                System.out.println("请输入要删除信息的密码：：");
                password=input.next();
                isTrue(id,userName,password);
                break;
        }
    }

    private static void isTrue(int id, String userName, String password) {
        int count=0;
        Users users=new Users();
        users.setId(id);
        users.setName(userName);
        users.setPassword(password);
        count=service.deleteByCondition(users);
        if(count>0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    private static void select() {

        System.out.println("1.查询单个 2.查询所有");
        int num=input.nextInt();
        switch (num){
            case 1:
                selectOne();
                break;
            case 2:
                selectEach();
                break;
            default:
                System.out.println("输出错误从新执行");
                function();
                break;
        }


    }

    private static void selectOne() {

        System.out.println("请输入查询条件：");
        System.out.println("输入ID:");
        int id=input.nextInt();
        System.out.println("输入用户名：");
        String userName=input.next();
        System.out.println("输入密码：");
        String password=input.next();

        Users users=service.findByCondition(id,userName,password);
        System.out.println(users);
        function();

    }

    private static void selectEach() {
        List<Users> list=new ArrayList<>();
        List<Users> list1 = service.selectEach();
        for (Users item:list1) {
            System.out.println(item.getId()+"\t"+item.getName());
        }
    }


}

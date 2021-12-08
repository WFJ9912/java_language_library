package com.wufujian.java4;

/**
 * @author:gfk
 * @create:2021/12/8
 * @Description:
 * @FileName:Person
 * @History:
 * @自定义内容:
 */
public class Person {
    public String name;
    public int age;
    int id = 1001;//身份标识

    public Person() {
        System.out.println("我无处不在！");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age;
    }
}

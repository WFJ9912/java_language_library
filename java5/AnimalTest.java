package com.wufujian.java5;
//多态性的使用举例一

import java.sql.Connection;

/**
 * @author:gfk
 * @create:2021/12/10
 * @Description:
 * @FileName:AnimalTest
 * @History:
 * @自定义内容:
 */
//多态性的使用举例一：
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());

        test.func(new Cat());

        //对比
        /**
         * public void func(Dog dog){
         *      dog.eat();
         *      dog.shout();
         * }
         * public void func(Cat cat){
         *      cat.eat();
         *      cat.shout();
         * }
         */
    }

    public void func(Animal animal){
        animal.eat();;
        animal.shout();;
    }
}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void shout(){
        System.out.println("动物叫");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout(){
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout(){
        System.out.println("喵！喵！喵！");
    }
}
//举例二
class Order{
    public void method(Object obj){

    }
}

//举例三
class Dricer{
    public void doData(Connection conn){//conn = new MySQlConnection()  /  conn = new OracleConnection
        //coon.method1();
        //conn.method2();
        //conn.method3();


    }
}

//举例

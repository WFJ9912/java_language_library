package com.wufujian.java5;

import java.util.Random;

/**
 * @author:gfk
 * @create:2021/12/11
 * @Description:
 * @FileName:InterviewTest
 * @History:
 * @自定义内容:
 */
//面试题：多态是编译时行为还是运行时行为？
    //多态是运行时行为
    //证明如下：
class Animal1{
    protected void eat(){
        System.out.println("animal eat food");
    }
}

class Cat1 extends Animal1{
    @Override
    protected void eat(){
        System.out.println("cat eat fish");
    }
}

class Dog1  extends Animal1{
    @Override
    public void eat(){
        System.out.println("Dog eat bone");
    }
}

class Sheep1 extends Animal1{
    @Override
    public void eat(){
        System.out.println("Sheep eat grass");
    }
}
public class InterviewTest {
    public static Animal1 getInstance(int key){
        switch(key){
            case 0:
                return new Cat1();
            case 1:
                return new Dog1();
            default:
                return new Sheep1();
        }
    }

    public static void main(String[] args) {
        int key = new Random().nextInt(3);
        System.out.println(key);
        Animal1 animal1 = getInstance(key);
        animal1.eat();
    }
}

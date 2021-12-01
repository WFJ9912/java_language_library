package com.wufujian.java1;

/**
 * @author:gfk
 * @create:2021/12/1
 * @Description:
 * @FileName:PersonTest
 * @History:
 * @自定义内容:
 */

/**
 * 类的结构之三：构造器（或构造方法、construct）的使用
 * construct：建设、建造      constructor：建设者
 *
 * 一、构造器的作用：
 * 创建对象;给对象进行初始化
 *
 * 二、说明
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符 类名（形参列表）{}
 *
 * 三、构造器的特征：
 * 1.它具有与类相同的名称
 * 2.它不声明返回值类型。（与声明为void不同）
 * 3.不能被static、final、synchronized、abstract、native修饰，不能有return语句返回值
 *
 * 四、根据参数的不同，构造器可以分为如下两类：
 * 1.隐式无参构造器（系统默认提供）
 * 2.显式定义一个或多个构造器（有参、无参）
 *
 * 五、构造器重载
 * 1.构造器一般用来创建对象的同时初始化对象。
 * 2.构造器重载使得对象的创建更加灵活，方便创建各种不同的对象
 *
 */
public class PersonTest1 {
    public static void main(String[] args) {
        //创建类的对象：new + 构造器
        Person p = new Person();
        p.eat();
    }
}


class Person{
    //属性
    String name;
    int age;

    //构造器
    public Person(){

    }
    public Person(String n, int a){
        name = n;
        age = a;
    }
    public Person(String n){
        name = n;
    }

    //方法
    public void eat() {
        System.out.println("人吃饭");
    }
}

package com.wufujian.java8;

/**
 * @author:gfk
 * @create:2021/12/13
 * @Description:
 * @FileName:ToStringTest
 * @History:
 * @自定义内容:
 */

import java.util.Date;

/**
 * Object类中toString()的使用
 *
 * 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 *
 * 2.Object类中toString()的定义：
 * public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *
 * 3.像String、Date、Fle、包装类等都重写了Object类中的toString()方法。
 * 使得在调用对象的toString()时，返回“实体内容”信息
 *
 * 4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的“实体内容”
 */
public class ToStringTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom",21);
        System.out.println(cust1.toString());//com.wufujian.java8.Customer@1b6d3586-->Customer[name = Tom,age = 21]
        System.out.println(cust1);//com.wufujian.java8.Customer@1b6d3586-->Customer[name = Tom,age = 21]

        String str = new String("MM");
        System.out.println(str);//MM

        Date date = new Date(453453453453453L);
        System.out.println(date.toString());//Tue May 16 04:37:33 CST 16339
    }
}

class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //手动实现
//    @Override
//    public String toString() {
//        return "Customer[name = " + name + ",age = " + age + "]";
//    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

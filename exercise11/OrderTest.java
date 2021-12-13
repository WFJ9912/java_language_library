package com.wufujian.exercise11;

/**
 * @author:gfk
 * @create:2021/12/13
 * @Description:
 * @FileName:Order
 * @History:
 * @自定义内容:
 */

/**
 * 1.编写Order类，有int型的orderId，String型的orderName，相应的getter()和setter()方法，
 * 两个参数的构造器，重写父类的equals()方法：public boolean equals(Object obj)，并判断测试类中创建的两个对象是否相等。
 */

public class OrderTest{
    public static void main(String[] args) {
        Order order1 = new Order(1001,"AA");
        Order order2 = new Order(1001,"BB");
        System.out.println(order1.equals(order2));
        Order order3 = new Order(1001,"BB");
        System.out.println(order2.equals(order3));

        String s1 = "BB";
        String s2 = "BB";
        System.out.println(s1 == s2);//true--比较的是地址
        //存在于常量池中
    }

}
 class Order {
    int orderId;
    String orderName;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrdername(){
        return orderName;
    }

    public void setOrdername(String orderName) {
         this.orderName = orderName;
    }

     public Order(int orderId, String orderName) {
         this.orderId = orderId;
         this.orderName = orderName;
     }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof Order){
            Order order = (Order)obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }

}

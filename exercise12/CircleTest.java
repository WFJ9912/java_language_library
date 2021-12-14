package com.wufujian.exercise12;

/**
 * @author:gfk
 * @create:2021/12/14
 * @Description:
 * @FileName:CircleTest
 * @History:
 * @自定义内容:
 */

/**
 * 定义两个类，父类GeometricObject代表几何形状，子类Circle代表圆形。
 *
 * GeometricObject
 * protected  String  color
 * protected  double  weight
 * protected GeometricObject() 初始化对象的color属性为“white”，weight属性为1.0
 * protected  GeometricObject(String color, double weight)
 * 属性的getter和setter方法
 *
 * Circle
 * private double radius
 * public Circle()初始化对象的color属性为“white”，weight属性为1.0，radius属性为1.0。
 * public Circle(double radius)初始化对象的color属性为“white”，weight属性为1.0，radius根据参数构造器确定。
 * public Circle(double radius,String color,double weight)
 * radius属性的setter和getter方法
 * public double findArea()：计算圆的面积
 * public boolean equals(Object obj)重写equals方法,比较两个圆的半径是否相等，如相等，返回true。
 * public String toString()重写toString方法,输出圆的半径。
 *
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等；
 * 利用equals方法判断其半径是否相等；
 * 利用toString()方法输出其半径。
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.3);
        Circle circle2 = new Circle(2.3,"white",2.0);
        //Circle circle2 = new Circle(2.3,new String("white"),2.0);


        System.out.println("颜色是否相等：" + circle1.getColor().equals(circle2.getColor()));

        System.out.println("半径是否相等：" + circle1.equals(circle2));

        System.out.println(circle1);

        System.out.println(circle2.toString());

    }
}

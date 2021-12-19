package com.wufujian.exercise18;

/**
 * @author:gfk
 * @create:2021/12/19
 * @Description:
 * @FileName:ComparableCircleTest
 * @History:
 * @自定义内容:
 */

/**
 * 定义一个接口用来实现两个对象的比较。
 * interfaceCompareObject{
 * public int compareTo(Object o);//若返回值是0,代表相等;若为正数，代表当
 * 前对象大；负数代表当前对象小
 * }
 * 定义一个Circle类，声明radius属性，提供getter和setter方法
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小。
 * 定义一个测试类InterfaceTest，创建两个ComparableCircle对象，调用compareTo方法比较两个类的半径大小。
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);

        int compareValue = c1.compareTo(c2);
        if(compareValue > 0){
            System.out.println("c1对象大");
        }else if(compareValue < 0){
            System.out.println("c2对象大");
        }else{
            System.out.println("c1与c2一样大");
        }
    }
}

package com.wufujian.java13;

/**
 * @author:gfk
 * @create:2021/12/19
 * @Description:
 * @FileName:InterfaceTest
 * @History:
 * @自定义内容:
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
//        Flyable.MIN_SPEED = 2;

        Plane plane = new Plane();
        plane.fly();;
    }
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final

    //抽象方法
    public abstract  void fly();
    void stop();//省略了public abstract
}

interface Attackable{
    void attack();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }

}

class Bullet implements Flyable,Attackable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
//***************************************

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{

}

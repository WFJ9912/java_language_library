/**
 * @author:gfk
 * @create:2021/11/25
 * @Description:
 * @FileName:_Class
 * @History:
 * @自定义内容:
 */
public class _Class {
    /*
    ·类 和 对象 是面向对象的核心概念
    1.类是对一类事物的描述，是抽象的、概念上的定义。
    2.对象是实际存在的该类事物的每个个体，因而也称为实例（instance）

    ·Java代码世界中由许多不同功能的类构成的。
    常见的类的成员：  属性（Field）：对应类中的成员变量（域、字段）
                    方法（Method）：对应类中成员的方法（函数）
     */

    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构、属性、方法。
        p1.name = "Tom";
        System.out.println(p1.name);
        p1.walk();
        p1.talk("Chinese");
    }
}

 class Person {
    //属性，或成员变量
    int age;
    String name;
    boolean isMarried;

    //构造器
    public Person() {
    }

    public Person(String n, boolean im) {
        name = n;
        isMarried = im;
    }

    //方法或函数
    public void walk() {
        System.out.println("人走路。。。");
    }

    public String display() {
        return "名字是：" + name + "，Married: " + isMarried;
    }

    public void talk(String language) {
        System.out.println("讲的语言是：" + language);
    }

    //代码块
    {
        name = "HanMeiMei";
        age = 17;
        isMarried = true;
    }

    //内部类
    class pet {
        String name;
        float weight;
    }
}

/*
    总结：
    1.类和对象的使用（面向对象思想的实现）：
        （1）.创建类、设计类的成员。
        （2）.创建类的对象。
        （3）.通过“对象.属性”或“对象.方法”调用对象的结构。
    2.如果创建了一个类的多个对象，则每个对象都独立拥有一套类的属性。（非static的）
*/

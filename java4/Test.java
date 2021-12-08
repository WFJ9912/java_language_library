package com.wufujian.java4;

/**
 * @author:gfk
 * @create:2021/12/8
 * @Description:
 * @FileName:Test
 * @History:
 * @自定义内容:
 */

/**
 * 方法的重写：
 *      定义：在子类中可以根据需要对从父类中继承来的方法进行改造，也称为方法的重置、覆盖。
 *  在程序执行时，子类的方法将要覆盖父类的方法。
 *
 *      应用：重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法时，实际执行的是子类重写父类的方法。
 *
 * super关键字的使用：
 *      定义：调用父类中指定的操作，可以访问父类中定义的属性、方法、构造器。
 *      应用：我们可以在子类的方法或构造器中。通过使用“super.属性”或“super.方法”的方式，显式的调用
 *  父类中声明的属性或方法。但是通常情况下，我们省略“super.”
 *
 *           特殊情况下，当子类和父类中定义了同名的属性时，我们想在子类中调用父类中声明的属性，则必须显式的
 *  使用“super.属性”的方式，表明调用的是父类中声明的属性。
 *                      当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则必须显式的
 *  使用“super.属性”的方式，表明调用的是父类中被重写的方法。
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "honghong";
        s1.age = 18;
        s1.school = "star";
        String temp = s1.getInfo();
        System.out.println(temp);

        System.out.println("**********");

        Person p1 = new Person();
        p1.age = 19;
        p1.name = "lili";
        p1.getInfo();
        temp = p1.getInfo();
        System.out.println(temp);

        System.out.println("**********");

        s1.show();

        System.out.println("**********");

        Student s2 = new Student("Tom",21,"IT");
        s2.show();

    }
}

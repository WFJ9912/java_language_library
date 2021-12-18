package com.wufujian.exercise16;

/**
 * @author:gfk
 * @create:2021/12/18
 * @Description:
 * @FileName:EmployeeTest
 * @History:
 * @自定义内容:
 */

/**
 * 练习：
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。提供必要的构造器和抽象方法：work()。
 * 对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
 * 请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。
 */

/**
 * 知识补充：
 * 抽象类的匿名子类
 */
public class EmployeeTest {
    public static void main(String[] args) {

        //多态,抽象多态
        Employee manager = new Manager("库克",1001,5000,50000);
        //Manager manager1 = new Manager("库克",1001,5000,50000);//非匿名的类非匿名的对象

        manager.work();
        //method(manager1);//非匿名的类匿名的对象


        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();

        method(new Manager(1000));//非匿名的类匿名的对象
        //创建了一匿名子类的对象p
        Employee p = new Employee() {
            @Override
            public void work() {
                System.out.println("工作！");
            }
        };

        method(p);

        //创建匿名子类的匿名对象
        method(new Employee(){

            @Override
            public void work() {
                System.out.println("people walk.");
            }
        });
    }
    public static void method(Employee employee) {

    }
}

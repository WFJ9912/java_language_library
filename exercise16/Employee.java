package com.wufujian.exercise16;

/**
 * @author:gfk
 * @create:2021/12/18
 * @Description:
 * @FileName:Employee
 * @History:
 * @自定义内容:
 */
public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}

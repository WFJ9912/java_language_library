package com.wufujian.exercise16;

/**
 * @author:gfk
 * @create:2021/12/18
 * @Description:
 * @FileName:Manager
 * @History:
 * @自定义内容:
 */
public class Manager extends Employee{
    private double bonus;//奖金


    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理员工，提供公司运行的效率");
    }
}

package com.wufujian.exercise16;

/**
 * @author:gfk
 * @create:2021/12/18
 * @Description:
 * @FileName:CommonEmployee
 * @History:
 * @自定义内容:
 */
public class CommonEmployee extends Employee{

    @Override
    public void work() {
        System.out.println("员工在一线车间生成产品");
    }
}

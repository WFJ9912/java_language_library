package com.wufujian.java5;

/**
 * @author:gfk
 * @create:2021/12/10
 * @Description:
 * @FileName:Man
 * @History:
 * @自定义内容:
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    @Override
    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    @Override
    public void walk(){
        System.out.println("男人霸气的走路");
    }
}

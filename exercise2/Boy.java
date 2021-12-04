package com.wufujian.exercise2;

/**
 * @author:gfk
 * @create:2021/12/4
 * @Description:
 * @FileName:Boy
 * @History:
 * @自定义内容:
 */
public class Boy {
    private String name;
    private int age;

    public Boy(String name) {
        this.name = name;
    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Girl girl){
        System.out.println("我想娶" + girl.getName());
    }

    public void shout(){
        if(this.age >= 22){
            System.out.println("你可以去合法登记结婚了！");
        }else{
            System.out.println("先多谈谈恋爱~~");
        }
    }
}

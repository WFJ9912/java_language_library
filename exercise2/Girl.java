package com.wufujian.exercise2;

/**
 * @author:gfk
 * @create:2021/12/4
 * @Description:
 * @FileName:Girl
 * @History:
 * @自定义内容:
 */
public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    /**
     * @Description 比较两个对象的大小
     * @param girl
     * @return 正数：当前对象大； 负数:当前对象小； 0：当前对象与形参对象相等
     */
    public int compare(Girl girl){
        return this.age - girl.age;
        //方法对象的属性 - 形参对象的属性
    }
}

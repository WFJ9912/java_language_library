package com.wufujian.java;/**
 * @auther shkstart
 * @create 2022-01-09 20:28
 */

/**
 *@author:gfk
 *@create:2022/1/9
 *@Description:
 *@FileName:SeasonTest2
 *@History:
 *@自定义内容:
 */

/**
 * 使用enum关键字定义枚举类
 *     说明：定义的枚举类默认继承与java.lang.Enum类
 */
public class SeasonTest2 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);
        System.out.println(Season1.class.getSuperclass());
    }
}

enum Season1{
    //1.提供当前枚举类的对象，多个对象之间用“，”隔开，末尾对象“；”结束
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    //2.声明Season对象的属性private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.其他诉求1：获取枚举类的对象属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //注意：不需要重写toString(),但也可根据具体的要求重写
}

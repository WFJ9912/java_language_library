package com.wufujian.exercise2;

/**
 * @author:gfk
 * @create:2021/12/4
 * @Description:
 * @FileName:BoyGirlTest
 * @History:
 * @自定义内容:
 */

/**
 * this关键字的练习
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",21);
        boy.shout();
        Girl girl = new Girl("朱丽叶",18);
        girl.marry(boy);

        Girl girl1 =  new Girl("祝英台",19);
        int compare = girl.compare(girl1);
        if(compare > 0){
            System.out.println(girl.getName() + "大");
        }else if(compare < 0){
            System.out.println(girl1.getName() + "大");
        }else{
            System.out.println("一样大");
        }
    }
}

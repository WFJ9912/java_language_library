package com.wufujian.java5;

/**
 * @author:gfk
 * @create:2021/12/10
 * @Description:
 * @FileName:Woman
 * @History:
 * @自定义内容:
 */
public class Woman extends Person{
    boolean isBeauty;

    public void goShopping(){
        System.out.println("女人喜欢购物");
    }

    @Override
    public void eat(){
        System.out.println("女人少吃，为了减肥");
    }

    @Override
    public void walk(){
        System.out.println("女人窈窕的走路");
    }
}

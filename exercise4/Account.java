package com.wufujian.exercise4;

/**
 * @author:gfk
 * @create:2021/12/4
 * @Description:
 * @FileName:Account
 * @History:
 * @自定义内容:
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        if(amt < 0) {
            balance += amt;
            System.out.println("存钱成功");
        }
    }

    public void withdraw(double amt){
        if(balance < amt){
            System.out.println("余额不足！");
            return;
        }
        balance -= amt;
        System.out.println("取钱成功");
    }
}

package com.wufujian.exercise3;

/**
 * @author:gfk
 * @create:2021/12/4
 * @Description:
 * @FileName:Account
 * @History:
 * @自定义内容:
 */

/**
 * 1、写一个名为Account的类模拟账户。该类的属性和方法如下图所示。
 * 该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 * 包含的方法：访问器方法（getter和setter方法），取款方法withdraw()，存款方法deposit()。
 *
 * 提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
 */
public class Account {
        private int id;//账号
        private double balance;//余额
        private double annualInterestRate;//年利率

        public Account(int id, double balance, double annualInterestRate) {
                this.id = id;
                this.balance = balance;
                this.annualInterestRate = annualInterestRate;
        }
        public Account(double balance) {
                this.balance = balance;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public double getBalance() {
                return balance;
        }

        public void setBalance(double balance) {
                this.balance = balance;
        }

        public double getAnnualInterestRate() {
                return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
                this.annualInterestRate = annualInterestRate;
        }

        public void withdraw(double amount){
                if(balance < amount){
                        System.out.println("余额不足，取款失败");
                        return;
                }
                balance -= amount;
                System.out.println("成功取出：" + amount);
        }

        public void deposit(double amount){
                if(amount > 0){
                        balance += amount;
                        System.out.println("成功存入：" + amount);
                }
        }
}

package com.wufujian.exercise7;

/**
 * @author:gfk
 * @create:2021/12/9
 * @Description:
 * @FileName:AccountTest
 * @History:
 * @自定义内容:
 */

/**
 *实验类的继承，super
 * 1、写一个名为Account的类模拟账户。
 *    该类的属性和方法如下图所示。
 *    该类包括的属性：账号id，余额balance，年利率annualInterestRate；
 *    包含的方法：访问器方法（getter和setter方法），返回月利率的方法getMonthlyInterest()，取款方法withdraw()，存款方法deposit()。
 *
 * 2、写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。使用withdraw方法提款30000元，并打印余额。
 * 再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 *
 * 3、创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。在CheckAccount类中重写withdraw方法，其算法如下：
 * 如果（取款金额<账户余额），可直接取款
 * 如果（取款金额>账户余额），计算需要透支的额度
 * 判断可透支额overdraft是否足够支付本次透支需要，如果可以
 * 将账户余额修改为0，冲减可透支金额如果不可以
 * 提示用户超过可透支额的限额
 * 要求：写一个用户程序测试CheckAccount类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印账户余额和可透支额。再使用withdraw方法提款18000元，并打印账户余额和可透支额。再使用withdraw方法提款3000元，并打印账户余额和可透支额。
 */
public class AccountTest {
    public static void main(String[] args) {
        Account Acct = new Account(1122,20000,0.045);
        Acct.withdraw(30000);
        System.out.println("您的账户余额为：" + Acct.getBalance());
        Acct.withdraw(2500);
        System.out.println("您的账户余额为：" + Acct.getBalance());
        Acct.deposit(3000);
        System.out.println("您的账户余额为：" + Acct.getBalance());
        System.out.println("月利率为：" + (Acct.getMonthlyInterest() * 100) + "%");
    }
}

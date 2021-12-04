package com.wufujian.exercise4;

/**
 * @author:gfk
 * @create:2021/12/4
 * @Description:
 * @FileName:Customer
 * @History:
 * @自定义内容:
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

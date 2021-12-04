package com.wufujian.exercise4;

import com.wufujian.exercise3.Customer;

/**
 * @author:gfk
 * @create:2021/12/4
 * @Description:
 * @FileName:Bank
 * @History:
 * @自定义内容:
 */

/**
 * addCustomer方法必须依照参数（姓，名）构造一个新的Customer对象，然后把它放到customer数组中。还必须把numberOfCustomer属性的值加1。
 * getNumOfCustomers方法返回numberofCustomers属性值。
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
    }

    public void addCustomer(String f,String l) {
        Customer cust = new Customer(f,l);
        customers[numberOfCustomers++] = cust;
    }

    public int getNumOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        if(index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
}

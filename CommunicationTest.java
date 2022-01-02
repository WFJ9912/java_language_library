package com.wufujian.java;/**
 * @auther shkstart
 * @create 2022-01-02 20:00
 */


/**
 *@author:gfk
 *@create:2022/1/2
 *@Description:
 *@FileName:Testone
 *@History:
 *@自定义内容:
 */

/**
 * 线程通信：交替输出
 */

class Number implements Runnable{
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized(this){
                notify();
                if(number <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

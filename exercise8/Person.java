package com.wufujian.exercise8;

/**
 * @author:gfk
 * @create:2021/11/30
 * @Description:
 * @FileName:Person
 * @History:
 * @自定义内容:
 */

/**
 * 练习8
 * 1.创建程序,在其中定义两个类：Person和PersonTest类。定义如下：用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
 * 在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法，体会Java的封装性。
 */
public class Person {
    private int age;

    public void setAge(int o) {
        if(o < 0 || o > 130){
            throw new RuntimeException("传入的数据非法！");
            //System.out.println("传入数据非法！");
            //return;
        }
            age = o;

    }

    public int getAge() {
        return age;
    }
}

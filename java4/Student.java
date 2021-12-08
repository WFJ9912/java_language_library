package com.wufujian.java4;

/**
 * @author:gfk
 * @create:2021/12/8
 * @Description:
 * @FileName:Student
 * @History:
 * @自定义内容:
 */
public class Student extends Person{
    public String school;
    int id = 1002;//学号

    public Student(){
            //super();默认，调用父类空参构造器
    }

    public Student(String school){
        this.school = school;
    }

    public Student(String name,int age, String school){
        super(name, age);
        this.school = school;
    }
    @Override
    public String getInfo() {//方法的重写
        //return "Name:" + name + "\n" + "age:" + age +  "\n" + "school:" + school;
        return super.getInfo() + "\n" + "school:" + school;//super关键字的使用
    }

    @Override
    public void eat(){
        System.out.println("学生，多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生，学习知识");
    }

    public void show(){
        System.out.println("name = " + this.name + ", age = " + super.age);
        System.out.println("id = " + id);//等价于this.id
        System.out.println("id = " + super.id);
        eat();//等价于this.eat
        super.eat();
    }


}

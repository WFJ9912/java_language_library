package com.wufujian.exercise12;

/**
 * @author:gfk
 * @create:2021/12/14
 * @Description:
 * @FileName:Circle
 * @History:
 * @自定义内容:
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        radius = 1.0;
//        color = "white";
//        weight = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight) {
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Circle){
            Circle c = (Circle)obj;
            return this.radius == c.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

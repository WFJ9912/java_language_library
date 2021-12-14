package com.wufujian.exercise12;

/**
 * @author:gfk
 * @create:2021/12/14
 * @Description:
 * @FileName:GeometricObject
 * @History:
 * @自定义内容:
 */
public class GeometricObject {

    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

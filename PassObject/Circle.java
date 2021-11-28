/**
 * @author:gfk
 * @create:2021/11/28
 * @Description:
 * @FileName:Circle
 * @History:
 * @自定义内容:
 */

/**
 * （1）定义一个Circle类，包含一个double型的radius属性代表圆的面积，
 * 一个findArea（）方法返回圆的面积
 */
public class Circle {
    double radius;
    //半径

    //求圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}

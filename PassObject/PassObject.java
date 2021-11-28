/**
 * @author:gfk
 * @create:2021/11/28
 * @Description:
 * @FileName:PassObject
 * @History:
 * @自定义内容:
 */
/**
 * （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：publicvoidprintAreas(Circlec,inttime)
 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 （3）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图
 所示。
 */



public class PassObject{
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle c = new Circle();
        test.printAreas(c, 5);
        System.out.println("now radius is " + c.radius);
    }


    public void printAreas(Circle c,int time){
        System.out.println("Radius\t\tarea");
        //设置圆的半径
        for(int i=1;i<=time;i++){
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());
        }
        c.radius = time + 1;

    }
}
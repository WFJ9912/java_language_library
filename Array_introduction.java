/**
 * @author:gfk
 * @create:2021/11/22
 * @Description:
 * @FileName:Array_introduction
 * @History:
 * @自定义内容:
 */

import java.util.Scanner;

public class Array_introduction {
    public static void main(String[] args) {

        //一维数组
        int[] ids;//声明
        ids = new int[] { 1001, 1002, 1003, 1004 };//静态初始化：数组的初始化和数组元素的赋值操作同时进行
        String[] names = new String[5];//动态初始化：数组的初始化和数组元素的赋值操作分开进行

        //遍历数组
        for (int i = 0; i < ids.length; i++) {
            System.out.println(ids[i]);
        }

        System.out.println();

		/*一维数组的练习
		 *
		 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
		        成绩>=最高分-18等级为A
				成绩>=最高分-20等级为B
				成绩>=最高分-30等级为C
				其余等级为D
		*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数:");
        int number = scanner.nextInt();

        int[] scores = new int[number];
        System.out.println("请输入"+number+"个学生成绩:");
        int maxScore = 0;
        for(int i = 0;i < scores.length;i++){
            scores[i] = scanner.nextInt();
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }

        char level;
        for(int i = 0;i < scores.length;i++){
            if(maxScore - scores[i] <= 10){
                level = 'A';
            }else if(maxScore - scores[i] <= 20){
                level = 'B';
            }else if(maxScore - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }

            System.out.println("student " + i + " score is " + scores[i] + ",grade is" + level );
        }

        System.out.println();

        //二维数组
        //int[] arr = new int[]{1,2,3};// 静态初始化
        //int[] arr = {1,2,3,4};//动态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        int[][] arr4 = {{1,2,3},{4,5},{6,7,8}};
        String[][] arr2 = new String[3][2];
        //	String[] arr2[] = new String[3][2];//结果同上
        //	String[][] arr2 = new String[3][];//可行的

        //数组遍历
        for(int i = 0;i < arr4.length;i++){
            for(int j = 0;j <arr4[i].length;j++){
                System.out.print(arr4[i][j]+" ");
            }
        }


        System.out.println();
        /*
         * 二维数组的练习-杨辉三角
         */
        int[][] yangHui = new int[10][];
        for(int i = 0;i < yangHui.length;i++){
            yangHui[i] = new int[i + 1];

            yangHui[i][0] = yangHui[i][i] = 1;

            if(i > 1){
                for(int j = 1;j < yangHui[i].length-1;j++){
                    yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
                }
            }
        }

        for(int i = 0;i < yangHui.length;i++){
            for(int j = 0;j < yangHui[i].length;j++){
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }


        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for(int i = 0;i < array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
        array2 =  array1;//数组的赋值
        for(int i = 0;i < array2.length;i++){
            if(i%2 ==0 ){
                array2[i] = i;//改变array2的同时会改变array1
            }
        }
        System.out.println();
        for(int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + "\t");
        }

        System.out.println();

        //String[] arr1 = new String[5];
        String[] arr = new String[]{"JJ","DD","BB","GG","AA"};
        //数组的复制（区别于数组变量的赋值：arr3 = arr ）
        String[] arr3 = new String[arr.length];
        for(int i =0;i < arr3.length;i++){
            arr3[i] = arr[i];
        }
        //数组的反转
        //方法1:
        for(int i = 0;i < arr3.length / 2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for(int i = 0,j = arr.length - 1;i < j;i++,j--){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }

        System.out.println();

        //查找（或搜索）
        //线性查找
        String dest = "BB";
        boolean isFlag = true;
        for(int i = 0;i < arr.length;i++){
            if(dest.equals(arr[i])){
                System.out.print("找到了指定的元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if(isFlag){
            System.out.print("很遗憾，没有找到哦！");
        }

        System.out.println();

        //二分查找
        //前提：所要查找的数组必须有序
        int[] arr5 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int dest1 = -34;
        int head = 0;//初始的首索引
        int end = arr5.length - 1;//初始的末索引
        boolean isFlag1 = true;
        while(head <= end){
            int middle = (head + end)/2;
            if(dest1 == arr5[middle]){
                System.out.print("找到了指定的元素，位置为：" + middle);
                isFlag1 = false;
                break;
            }else if(arr5[middle] > dest1){
                end = middle - 1;
            }else{//arr5[middle] < dest1
                head = middle + 1;
            }
        }
        if(isFlag1){
            System.out.print("很遗憾，没有找到哦！");
        }
    }
}


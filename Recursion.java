import java.util.Scanner;

/**
 * @author:gfk
 * @create:2021/11/28
 * @Description:
 * @FileName:recursion
 * @History:
 * @自定义内容:
 */
public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recursion test = new Recursion();
        int sum1 = test.getSum1(100);
        System.out.println(sum1);

        System.out.println("***********");

        int value = test.f(10);
        System.out.println(value);

        System.out.println("***********");

        int value2 = test.fibonacci1(3);
        System.out.println(value2);
        int value3 = test.fibonacci2(5);
        System.out.println(value3);

        System.out.println("***********");

        char a = 'A',b = 'B',c = 'C';
        int number = scanner.nextInt();
        test.hanota(number,a,b,c);

        System.out.println("***********");

        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
        quicksort(data,0,data.length - 1);
        System.out.println("排序之后：\n" + java.util.Arrays.toString(data));

    }
    //1.计算1-n之间所有自然数的乘积
    public int getSum1(int n){
        if (n == 1){
            return 1;
        }else{
            return n * getSum1(n - 1);
        }
    }

    //2.已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
    public int f(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            //return f(n+2)-2*f(n+1)
            return 2 * f(n - 1) + f(n-2);
        }
    }

    //3.斐波那契数列
    public int fibonacci1(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci1(n - 1) + fibonacci1(n - 2);
        }
    }
    public int fibonacci2(int n){//优化算法
        int[] fibArray = new int[n*2];
        fibArray[0] = 0;
        fibArray[1] = 1;
        fibArray[2] = 1;
        if (n == 1) {
            return fibArray[1];
        } else if (n == 2) {
            return fibArray[2];
        } else {
            for (int i = 3; i <= n ; i++) {
                fibArray[i] = fibArray[i - 1] +fibArray[i - 2];
            }
            System.out.print("斐波那契数列为：");
            for (int i = 1; i <= n; i++) {
                System.out.print(fibArray[i]+"\t");
            }
            System.out.println();
            return fibArray[n];
        }
    }

    //4.汉诺塔问题
    public void move(int n, char x, char y){
        System.out.println(x + "-->" +y);
    }
    public void hanota(int n, char A, char B, char C){
        {
            if (n == 1)
            {
                move(n, A, C);
            }
            else
            {
                hanota(n - 1, A, C, B);
                move(n, A, C);
                hanota(n - 1, B, A, C);
            }
        }
    }

    //5.快排
    public static void quicksort(int[] data,int start,int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0) {
                    ;
                }
                while (high > start && data[--high] - base >= 0) {
                    ;
                }
                if (low < high) {
                    int temp = data[low];
                    data[low] = data[high];
                    data[high] = temp;
                } else {
                    break;
                }
            }
            int temp = data[start];
            data[start] = data[high];
            data[high] = temp;

            quicksort(data, start, high - 1);//递归调用
            quicksort(data, high + 1, end);
        }
    }
}

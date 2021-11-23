import java.util.Arrays;

/**
 * @author:gfk
 * @create:2021/11/23
 * @Description:
 * @FileName:Arrays_Class_Function
 * @History:
 * @自定义内容:
 */
public class Arrays_Class_Function {
    public static void main(String[] args) {
        int[] arr3 = new int[]{1, 5, 3, 7};
        int[] arr4 = new int[]{1, 3, 2, 4};

        boolean isEquals = Arrays.equals(arr3, arr4);//判断两个数组是否相等 boolean equals(int[] a,int[] b)
        System.out.println(isEquals);

        System.out.println(Arrays.toString(arr4));//输出数组信息 String toString(int[] a,int[] b)

        Arrays.fill(arr4, 10);//将指定值填充到数组中 void fill(int[] a,int val)
        System.out.println(Arrays.toString(arr4));

        Arrays.sort(arr3);//对数组进行排序 void sort(int[] a)
        System.out.println(Arrays.toString(arr3));

        int index = Arrays.binarySearch(arr3, 7);//对排序后的数组进行二分法检索指定的值,返回其检索的值的对应索引（下标）， int binarySearch(int[] a,int key)
        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("no find it!");
        }


    }
}

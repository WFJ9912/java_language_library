package com.wufujian.java;/**
 * @auther shkstart
 * @create 2022-01-03 20:40
 */

import java.util.Arrays;

/**
 *@author:gfk
 *@create:2022/1/3
 *@Description:
 *@FileName:StringTest
 *@History:
 *@自定义内容:
 */
public class StringTest {
    public static void main(String[] args) {

        //1.将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为“abfedcg”；
        String str = "abcdefg";
        System.out.println(test1.reverse(str,2,5));
        System.out.println(test1.reverse1(str,2,5));
        System.out.println(test1.reverse2(str,2,5));

        //2.获取一个字符串在另一个字符串中出现的次数
        String str1 = "abkkcadkabkebfkabkskab";
        System.out.println(test2.getCount(str1,"ab"));

        //3.获取两个字符串中最大子串
        String str2 = "abcwerthelloyuiodef";
        String str3 = "cvhellobnm";
        String[] str4 = test3.getMaxSameString(str2,str3);
        System.out.println(Arrays.toString(str4));
    }
}

class test1{
    /**
     * 方法一：转换为char[]
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static String reverse(String str, int startIndex, int endIndex){
        if(str != null && str.length() != 0){
            char[] arr = str.toCharArray();
            for(int x = startIndex,y = endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }


    /**
     * 方法2：使用String拼接
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static String reverse1(String str,int startIndex,int endIndex){
        if(str != null){
            //第一部分
            String reverseStr = str.substring(0,startIndex);
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            //第三部分
            reverseStr += str.substring(endIndex+1);
            return reverseStr;
        }
        return null;
    }

    /**
     * 方式三：使用StringBuffer/StringBuilder替换String
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public static String reverse2(String str,int startIndex,int endIndex){
        if(str != null){
            StringBuilder builder = new StringBuilder(str.length());
            //第一部分
            builder.append(str.substring(0,startIndex));
            //第二部分
            for(int i = endIndex;i >= startIndex;i--){
                builder.append(str.charAt(i));
            }
            //第三部分
            builder.append(str.substring(endIndex + 1));
            return builder.toString();
        }
        return null;
    }
}

class test2{
    public static int getCount(String mainStr,String subStr){
        int mainLength = mainStr.length();
        int subLength = subStr.length();
        int cout = 0;
        int index = 0;
        if(mainLength >= subLength){
//            //方式一：
//            while((index = mainStr.indexOf(subStr)) != -1){
//                cout++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }

            //方式二：对方式一的改进
            while((index = mainStr.indexOf(subStr,index)) != -1){
                cout++;
                index += subLength;
            }

            return cout;

        }else{
            return 0;
        }
    }
}

class test3{
    public static String[] getMaxSameString(String str1,String str2){
        if(str1 != null && str2 != null){
            StringBuffer sBuffer = new StringBuffer();
            String maxString = (str1.length() > str2.length() ? str1 : str2);
            String minString = (str1.length() > str2.length() ? str2 : str1);
            int len = minString.length();
            for(int i = 0;i < len;i++){
                for(int x = 0,y = len - i;y < len;x++,y++){
                    String substring = minString.substring(x,y);
                    if(maxString.contains(substring)){
                        sBuffer.append(substring + ",");
                    }
                }
                if(sBuffer.length() != 0){
                    break;
                }
            }
            String[] split = sBuffer.toString().replaceAll(",$","").split("\\,");
            return split;
        }
        return null;
    }


}


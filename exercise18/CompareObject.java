package com.wufujian.exercise18;

/**
 * @author:gfk
 * @create:2021/12/19
 * @Description:
 * @FileName:CompareObject
 * @History:
 * @自定义内容:
 */
public interface CompareObject {
    //若返回值是0，代表相等；若为整数，代表当前对象大；负数代表当前对象小
    public  int compareTo(Object o);
}

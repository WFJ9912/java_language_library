package com.wufujian.myproject03.service;

/**
 * @author:gfk
 * @create:2021/12/21
 * @Description:表示员工状态
 * @FileName:Status
 * @History:
 * @自定义内容:
 */
public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}

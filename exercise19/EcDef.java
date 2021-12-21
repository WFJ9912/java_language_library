package com.wufujian.exercise19;

/**
 * @author:gfk
 * @create:2021/12/21
 * @Description:
 * @FileName:Ecdef
 * @History:
 * @自定义内容:
 */

//自定义异常类
public class EcDef extends Exception{
    static final long serialVersionUID = -3387517493124229948L;

    public EcDef() {
    }

    public EcDef(String msg){
        super(msg);
    }
}

package com.wufujian.myproject03.service;

/**
 * @author:gfk
 * @create:2021/12/22
 * @Description: 自定义异常类
 * @FileName:TeamException
 * @History:
 * @自定义内容:
 */


public class TeamException extends Exception{
    static final long serialVersionUID = -3387417993124229948L;

    public TeamException() {
        super();
    }

    public TeamException(String message) {
        super(message);
    }
}

package com.imooc.miaosha.result;

import com.sun.org.apache.bcel.internal.classfile.Code;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    /*
    成功时候调用
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }

    /*
    失败时候调用
     */
    public static <T> Result<T> error(CodeMsg cm){
        return new Result<T>(cm);
    }

    private Result(T data){
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private Result(CodeMsg cm) {
        if(cm == null){
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }


    public T getData() {
        return data;
    }

}

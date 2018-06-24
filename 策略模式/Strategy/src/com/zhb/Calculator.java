package com.zhb;

import com.zhb.service.Operation;

/**
 * @Auther: curry
 * @Date: 2018/6/23 08:25
 * @Description:
 */
public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int num1 , int num2){
        return this.operation.doOperation(num1,num2);
    }
}

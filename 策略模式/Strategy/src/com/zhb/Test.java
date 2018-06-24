package com.zhb;

import com.zhb.service.impl.OperationAdd;

/**
 * @Auther: curry
 * @Date: 2018/6/23 08:32
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new OperationAdd());

        int result = calculator.doOperation(1,2);

        System.out.println(result);

    }
}

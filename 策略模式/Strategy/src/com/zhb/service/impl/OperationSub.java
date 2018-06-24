package com.zhb.service.impl;

import com.zhb.service.Operation;

/**
 * @Auther: curry
 * @Date: 2018/6/23 08:29
 * @Description:
 */
public class OperationSub implements Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

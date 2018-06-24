package com.zhb.service.impl;

import com.zhb.service.Person;

/**
 * @Auther: curry
 * @Date: 2018/6/23 09:21
 * @Description:
 */
public class Wang implements Person {
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public void show() {
        System.out.println("我是赤裸裸的老王");
    }
}

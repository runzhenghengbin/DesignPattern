package com.zhb;

import com.zhb.decorator.Hat;
import com.zhb.decorator.Jacket;
import com.zhb.service.Person;
import com.zhb.service.impl.Wang;

/**
 * @Auther: curry
 * @Date: 2018/6/23 09:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Person wang = new Wang();



        wang  = new Hat(new Jacket(wang));

        wang.show();

        System.out.println("买单：王总共消费"+wang.cost());
    }
}

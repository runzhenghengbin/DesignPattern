package com.zhb.decorator;

import com.zhb.service.Person;

/**
 * @Auther: curry
 * @Date: 2018/6/23 09:25
 * @Description:
 */
public abstract class ClothesDecorator implements Person {
    protected  Person person;

    public ClothesDecorator(Person person){
        this.person = person;
    }
}

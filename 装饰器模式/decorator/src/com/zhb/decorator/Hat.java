package com.zhb.decorator;

import com.zhb.service.Person;

/**
 * @Auther: curry
 * @Date: 2018/6/24 07:27
 * @Description:
 */
public class Hat extends ClothesDecorator{
    public Hat(Person person) {
        super(person);
    }

    @Override
    public double cost() {
        return person.cost()+50;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("买了帽子，累计花了"+this.cost());

    }
}

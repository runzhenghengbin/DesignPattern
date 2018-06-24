package com.zhb.decorator;

import com.zhb.service.Person;

/**
 * @Auther: curry
 * @Date: 2018/6/23 09:27
 * @Description:
 */
public class Jacket extends ClothesDecorator {

    public Jacket(Person person){
        super(person);
    }
    @Override
    public double cost() {
        return person.cost()+100;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("买了夹克，累计花了"+this.cost());
    }
}

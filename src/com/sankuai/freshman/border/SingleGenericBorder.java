package com.sankuai.freshman.border;


import com.sankuai.freshman.coffee.Coffee;
import com.sankuai.freshman.erasure.FactoryWithTypeToken;

/**
 * Created by pengliang on 15-6-11.
 */
public class SingleGenericBorder<T extends Coffee> {
    T coffee;

    public SingleGenericBorder(T coffee) {
        this.coffee = coffee;
    }

    public void doSomeThing() {
        System.out.println(coffee.getCoffeName());
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        new SingleGenericBorder<Coffee>(new FactoryWithTypeToken<Coffee>(){}.createInstance()).doSomeThing();
    }
}

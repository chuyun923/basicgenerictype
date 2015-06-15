package com.sankuai.freshman.border;


import com.sankuai.freshman.coffee.Coffee;
import com.sankuai.freshman.coffee.Mocha;

/**
 * Created by pengliang on 15-6-11.
 */
public class CoffeeConsumer<T extends Coffee> {
    private T favoriteCoffe;

    public CoffeeConsumer(T coffee) {
        favoriteCoffe = coffee;
    }

    public void consume() {
        System.out.println("consume :"+favoriteCoffe.getCoffeName());
    }

    public static void main(String[] args) {
        CoffeeConsumer<Coffee> coffeeConsumer = new CoffeeConsumer<Coffee>(new Coffee());
        coffeeConsumer.consume();
        CoffeeConsumer<Mocha> mochaCoffeeConsumer = new CoffeeConsumer<Mocha>(new Mocha());
        mochaCoffeeConsumer.consume();
    }
}

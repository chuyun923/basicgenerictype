package com.sankuai.freshman.factory;


import com.sankuai.freshman.coffee.Coffee;

/**
 * Created by pengliang on 15-6-10.
 */
public class UniversalFactory<T> {
    Class<T> tClass;

    public UniversalFactory(Class<T> tClass) {
        this.tClass = tClass;
    }

    public T createInstance()
            throws IllegalAccessException, InstantiationException {
        return this.tClass.newInstance();
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        UniversalFactory<String> stringUniversalFactory = new UniversalFactory<String>(String.class);

        String string = stringUniversalFactory.createInstance();

        UniversalFactory<Coffee> coffeeUniversalFactory = new UniversalFactory<Coffee>(Coffee.class);

        Coffee coffee = coffeeUniversalFactory.createInstance();

    }
}
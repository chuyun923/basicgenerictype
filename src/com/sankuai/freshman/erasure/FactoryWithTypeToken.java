package com.sankuai.freshman.erasure;


import com.sankuai.freshman.coffee.Coffee;

/**
 * Created by pengliang on 15-6-11.
 */
public class FactoryWithTypeToken <T> {
    Class<T> type;

    @SuppressWarnings("unchecked")
    public FactoryWithTypeToken() {
        type = (Class<T>) (new TypeToken(this).getType());
    }

    public T createInstance() throws IllegalAccessException, InstantiationException {
        return  type.newInstance();
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        /**
         * 这里使用匿名内部类作为类结构的载体，如此，这个类将会保存泛型信息！
         *
         * 这里直接   FactoryWithTypeToken<Coffee> coffeeFactoryWithTypeToken = new FactoryWithTypeToken<Coffee>()
         * 是获取不到泛型信息的
         */
        FactoryWithTypeToken<Coffee> coffeeFactoryWithTypeToken = new FactoryWithTypeToken<Coffee>(){};
        Coffee coffee = coffeeFactoryWithTypeToken.createInstance();

        System.out.println(coffee.getClass().getCanonicalName());
    }
}

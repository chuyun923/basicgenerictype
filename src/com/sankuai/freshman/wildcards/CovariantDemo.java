package com.sankuai.freshman.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengliang on 15-6-11.
 */
public class CovariantDemo {
    public static void main(String[] args) {
        /**
         * 数组支持协变
         */
        Class numberArrayClass = Number[].class;
        Class integerArrayClass = Integer[].class;

        //不ClassCastException 说明Integer[]是Number[]的子类
        System.out.println(integerArrayClass.asSubclass(numberArrayClass));
        //Error  泛型不支持协变
        //ArrayList<Number> numbers = new ArrayList<Integer>();

        ArrayList<? extends Number> numbers = new ArrayList<Integer>();
//        numbers.add(new Integer(1));
    }
}

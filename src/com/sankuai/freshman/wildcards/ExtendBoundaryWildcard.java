package com.sankuai.freshman.wildcards;

import com.sankuai.freshman.coffee.Coffee;
import com.sankuai.freshman.coffee.Mocha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengliang on 15-6-15.
 */
public class ExtendBoundaryWildcard {

    public static void processElements(List<? extends Coffee> elements) {
        for(Coffee o : elements) {
            System.out.println(o.getCoffeName());
        }
    }

    public static void main(String[] args) {
        processElements(new ArrayList<Coffee>());
        processElements(new ArrayList<Mocha>());
//        processElements(new ArrayList<String>());  Error
    }
}

package com.sankuai.freshman.wildcards;

import com.sankuai.freshman.coffee.Coffee;
import com.sankuai.freshman.coffee.Mocha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengliang on 15-6-15.
 */
public class UnkownWildcard {

    // ？ 未知通配符 <=> ? extends Object
    public static void processElements(List<?> elements) {
        for(Object o : elements) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        processElements(new ArrayList<Coffee>());
        processElements(new ArrayList<Mocha>());
        processElements(new ArrayList<String>());
    }
}

package com.sankuai.freshman.wildcards;

import com.sankuai.freshman.coffee.Coffee;
import com.sankuai.freshman.coffee.Mocha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengliang on 15-6-15.
 */
public class SuperBoundaryWildcard {
    public static void insertElements(List<? super Coffee> elements) {
        elements.add(new Coffee());
        elements.add(new Mocha());
    }

    public static void main(String[] args) {
        insertElements(new ArrayList<Coffee>());
//        processElements(new ArrayList<String>());  Error
    }
}

package com.sankuai.freshman.erasure;


import com.sankuai.freshman.coffee.Coffee;

import javax.xml.ws.Holder;
import java.util.*;

/**
 * Created by pengliang on 15-6-10.
 */
public class ShowErasureClient {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        Map<String, Coffee> map = new HashMap<String, Coffee>();

        System.out.println(Arrays.toString(strings.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));

        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<Coffee> coffeeArrayList = new ArrayList<Coffee>();

        Holder<String> holder = new Holder<String>();
        Holder<Coffee> coffeeHolder = new Holder<Coffee>();

        System.out.println(stringArrayList.getClass().equals(coffeeArrayList.getClass()));
        System.out.println(holder.getClass().equals(coffeeHolder.getClass()));


    }
}

package com.sankuai.freshman.erasure;

import com.sankuai.freshman.coffee.Coffee;

import java.lang.reflect.Type;

/**
 * Created by pengliang on 15-6-11.
 */
public class RetrieveGenericClass <T> {
    Type type;
    public RetrieveGenericClass() {
        this.type = new TypeToken(this).getType();
    }

    public static void main(String[] args) {
        RetrieveGenericClass retrieveGenericClass = new RetrieveGenericClass<String>(){};
        System.out.println(retrieveGenericClass.type);
        RetrieveGenericClass retrieveGenericClass1 = new RetrieveGenericClass<Coffee>(){};
        System.out.println(retrieveGenericClass1.type);
    }
}

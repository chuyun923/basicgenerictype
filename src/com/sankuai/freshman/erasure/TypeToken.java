package com.sankuai.freshman.erasure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by pengliang on 15-6-10.
 */
public class TypeToken {
    Class aClass;
    public TypeToken(Object object) {
        aClass = object.getClass();
    }

    public Type getType() {
        Type superClass = aClass.getGenericSuperclass();
        while (superClass instanceof  Class &&  superClass != Object.class) {
            superClass =((Class) superClass).getGenericSuperclass();
        }

        if(superClass instanceof Class) {
            return null;
        }
        ParameterizedType parameterized = (ParameterizedType)superClass;
        return parameterized.getActualTypeArguments()[0];
    }
}

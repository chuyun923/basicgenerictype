package com.sankuai.freshman.wildcards;

import com.sankuai.freshman.coffee.Coffee;
import com.sankuai.freshman.coffee.Mocha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengliang on 15-6-15.
 */
public class RejectCallGenericTypeWithWildcard {

    public static void main(String[] args) {
        List<? extends Coffee> lists = new ArrayList<Coffee>();
//        lists.add(new Coffee());   Error



        mHolder<Mocha> mHolder = new mHolder<Mocha>(new Mocha());

        mHolder<? extends Coffee> coffeHolder = mHolder;
//        coffeHolder.setData(new Coffee());   Error
    }
}

class mHolder<T> {
    T data;

    public mHolder(T t) {
        this.data = t;
    }

    public void setData(T t) {
        this.data = t;
    }

}

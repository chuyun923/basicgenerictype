package com.sankuai.freshman.border;


import com.sankuai.freshman.coffee.Coffee;
import com.sankuai.freshman.iinterface.Heater;
import com.sankuai.freshman.iinterface.Pump;

/**
 * Created by pengliang on 15-6-11.
 *
 * 泛型定义多个边界，这些边界可以是类、接口
 *
 * 边界中只能包含一个类，而且必须放到第一个；
 */
public class MultiGenericBorder<T extends Coffee & Heater & Pump> {

    T item;

    public void doSomeThing() {
        item.getCoffeName();  // 从coffee继承来的功能

        item.isHot();   //Heater
        item.off();
        item.on();

        item.pump();    // Pump

    }

}


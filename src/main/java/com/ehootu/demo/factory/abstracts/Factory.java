package com.ehootu.demo.factory.abstracts;

import com.ehootu.demo.factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-06 17:27
 **/
public  abstract class Factory {

    public abstract Car getAudi();

    public abstract Car getBMW();

}

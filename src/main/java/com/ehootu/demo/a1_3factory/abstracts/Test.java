package com.ehootu.demo.a1_3factory.abstracts;

import com.ehootu.demo.a1_3factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-07 10:18
 **/
public class Test {



    public static void main(String[] args) {
        Factory factory = new AudiFactory();

        TV tv = factory.getTV();

        Car car  = factory.getCar();

        tv.play();

        car.brand();

        car.color();
    }
}

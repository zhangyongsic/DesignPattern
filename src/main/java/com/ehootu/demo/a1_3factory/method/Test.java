package com.ehootu.demo.a1_3factory.method;

import com.ehootu.demo.a1_3factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-06 17:17
 **/
public class Test {
    public static void main(String[] args) {
        Factory factory   = new AudiFactory();
        Car car = factory.getCar();
        car.brand();
        car.color();
    }
}

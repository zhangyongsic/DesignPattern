package com.ehootu.demo.a1_3factory.method;

import com.ehootu.demo.a1_3factory.simple.BMW;
import com.ehootu.demo.a1_3factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-06 17:14
 **/
public class BMWFactory implements  Factory {

    public Car getCar() {
        return new BMW();
    }
}

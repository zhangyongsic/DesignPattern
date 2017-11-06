package com.ehootu.demo.factory.method;

import com.ehootu.demo.factory.simple.BMW;
import com.ehootu.demo.factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-06 17:14
 **/
public class BMWFactory implements  Factory {

    public Car getCar() {
        return new BMW();
    }
}

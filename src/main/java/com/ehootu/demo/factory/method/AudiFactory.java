package com.ehootu.demo.factory.method;

import com.ehootu.demo.factory.simple.Audi;
import com.ehootu.demo.factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-06 17:09
 **/
public class AudiFactory implements Factory{
    public Car getCar() {
        return new Audi();
    }
}

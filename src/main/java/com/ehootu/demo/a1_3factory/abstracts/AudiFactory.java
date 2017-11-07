package com.ehootu.demo.a1_3factory.abstracts;

import com.ehootu.demo.a1_3factory.simple.Audi;
import com.ehootu.demo.a1_3factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-06 17:31
 **/
public class AudiFactory implements Factory {

    public Car getCar() {
        return new Audi();
    }


    public TV getTV() {
        return new AudiTV();
    }
}

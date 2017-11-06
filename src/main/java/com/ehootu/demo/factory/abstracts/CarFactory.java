package com.ehootu.demo.factory.abstracts;

import com.ehootu.demo.factory.simple.Audi;
import com.ehootu.demo.factory.simple.BMW;
import com.ehootu.demo.factory.simple.Car;

/**
 * @author zhangyong
 * @create 2017-11-06 17:31
 **/
public class CarFactory extends Factory {

    @Override
    public Car getAudi() {
        return new Audi();
    }

    @Override
    public Car getBMW() {
        return new BMW();
    }
}

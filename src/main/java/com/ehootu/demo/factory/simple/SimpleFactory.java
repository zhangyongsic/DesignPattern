package com.ehootu.demo.factory.simple;

/**
 * @author zhangyong
 * @create 2017-11-06 15:51
 * 简单工厂模式
 **/

public class SimpleFactory {
    public static Car car =null;

    public static  Car getCar(String str){
        if(str.equals("Audi")){
            car = new Audi();
        }else if(str.equals("BMW")){
            car = new BMW();
        }
        return car;
    }

    public static void main(String[] args) {
        Car audi = getCar("Audi");
        audi.brand();
        audi.color();
    }

}

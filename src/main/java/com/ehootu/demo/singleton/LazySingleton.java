package com.ehootu.demo.singleton;

/**
 * 懒汉试 单列模式
 * @author zhangyong
 * @create 2017-11-06 15:35
 **/
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){ }

    public static LazySingleton getInstance(){
        if(instance==null){
            //对创建的的实例进行加锁
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

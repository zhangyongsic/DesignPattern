package com.ehootu.demo.a5prototype;

/**
 * @author zhangyong
 * @create 2017-11-07 10:53
 * 原型模式潜复制
 **/
public class User implements Cloneable{

    private String name;

    private Integer age;

    private String address;

    private String demo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", demo='" + demo + '\'' +
                '}';
    }

    @Override
    public User clone() {

        Object obj = null;

        try{
            obj = super.clone();
            return (User) obj;
        }catch (CloneNotSupportedException e){
            System.out.println("异常");
            e.printStackTrace();
            return null;
        }


    }
}

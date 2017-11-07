package com.ehootu.demo.a5prototype;

import java.io.*;

/**
 * @author zhangyong
 * @create 2017-11-07 11:16
 **/
public class Student implements Serializable{
    private String name;

    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }


    public Student deepClone() throws IOException,ClassNotFoundException{
        ByteArrayOutputStream bao = new ByteArrayOutputStream();

        ObjectOutputStream oos  = new ObjectOutputStream(bao);

        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());

        ObjectInputStream ois = new ObjectInputStream(bis);

       Student student =(Student) ois.readObject();

        return student;
    }
}

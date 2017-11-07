package com.ehootu.demo.a5prototype;

/**
 * @author zhangyong
 * @create 2017-11-07 11:00
 **/
public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张勇");
        user.setAge(25);
        user.setAddress("内江");
        user.setDemo("第一个");
        System.out.println("------------------------");
        System.out.println(user);

        System.out.println("------------------------");
        User new_user;
        new_user = user.clone();
//        new_user.setName("lisi");
        System.out.println(new_user);

        System.out.println(new_user ==user);
        System.out.println(new_user.getName() ==user.getName());
        System.out.println(new_user.getAddress() ==user.getAddress());
        System.out.println(new_user.getAge() == user.getAge());

        Student student  = new Student();

        student.setName("lisi");

        Student student2;
        try {
            student2 = student.deepClone();

            System.out.println(student ==student2);
            System.out.println(student.getName() ==student2.getName());
        }catch (Exception e){

        }
    }
}

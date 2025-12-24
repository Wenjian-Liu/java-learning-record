package com.itheima.chap01;

public class EqualsDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Chris",18);
        Person p2 = new Person("Chris",18);

        System.out.println(p1 == p2);

        System.out.println(p1.equals(p2));
    }
}

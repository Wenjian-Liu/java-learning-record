package com.itheima.chap01;

public class HashcodeDemo {
    public static void main(String args[]) {
        Person p1 = new Person("小明",18);
        Person p2 = new Person("小明",18);
        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p1.hashCode());
        System.out.println("--------------------------");
        System.out.println(p2.hashCode());
    }
}

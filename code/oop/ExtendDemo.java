package com.itheima.chap03;

public class ExtendDemo {
    public static void main(String[] args) {
        PhysicalProduct p = new PhysicalProduct("华为Mate70",7299.00,672.00);
        System.out.println(p.displayInfo());

        DigitalProduct d = new DigitalProduct("Appstore充值卡",99.00,"1234567890");
        System.out.println(d.displayInfo());
    }
}

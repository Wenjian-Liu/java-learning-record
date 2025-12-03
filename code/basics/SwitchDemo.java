package com.itheima.chap06;

import java.util.Random;

public class SwitchDemo {
    public static void main(String[] args) {
        //随机生成一个数字[0,6)
        Random random = new Random();
        int number = random.nextInt(6);

        //判断数字值，选择对应输出
        switch (number) {
            case 0 -> System.out.println("星期一");
            case 1 -> System.out.println("星期二");
            case 2 -> System.out.println("星期三");
            case 3 -> System.out.println("星期四");
            case 4 -> System.out.println("星期五");
            default -> System.out.println("周末休息");
        }
        /*switch (number) {
            case 0:
                System.out.println("星期一");
                break;
            case 1:
                System.out.println("星期二");
                break;
            case 2:
                System.out.println("星期三");
                break;
            case 3:
                System.out.println("星期四");
                break;
            case 4:
                System.out.println("星期五");
                break;
            default:
                System.out.println("周末休息");
                break;
        }*/
    }
}

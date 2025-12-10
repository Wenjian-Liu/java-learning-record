package com.itheima.chapter08;

public class VariadicParameter {
    public static void main(String[] args) {
        System.out.println(add());

        System.out.println(add(1, 2, 3, 4));
    }

    //定义一个方法，实现求任意个整数的和
    public static int add(int ... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}

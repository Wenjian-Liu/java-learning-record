package com.itheima.chapter08;

public class ArrayTraversalDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        printArray(arr);

        System.out.println(toString(arr));
    }
    //定义方法，用while循环遍历并打印int数组
    public static void printArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    //定义方法，用while循环遍历int数组，并将数组元素拼接为[1, 2, 3]格式的字符串并返回
    public static String toString(int[] arr) {
        String result = "[";
        int i = 0;
        while (i < arr.length) {
            result = result + arr[i];
            if (i < arr.length -1) {
                result = result + ", ";
            }
            i++;
        }
        result = result + "]";
        return result;
    }
}

package com.itheima.chap02;

public class SalaryDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(5000,10000);
        int salary =employee.calculateSalary('C');
        System.out.println(salary);
    }
}

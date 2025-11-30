package com.itheima.chap02;

public class SalaryDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(5000);
        System.out.println(employee.getBaseSalary());
        employee.setBonus(10000);

        int salary =employee.calculateSalary('C');
        System.out.println(salary);
    }
}

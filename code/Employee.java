package com.itheima.chap02;

public class Employee {
    private int baseSalary;
    private int bonus;

    public int calculateSalary(char grade) {
        double rate = switch (grade) {
            case 'A' -> 1.0;
            case 'B' -> 0.8;
            case 'C' -> 0.6;
            case 'D' -> 0.4;
            default -> 0;
        };
        return baseSalary + (int)(bonus * rate);
    }
    public void setBaseSalary(int baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("BaseSalary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBonus(int bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative.");
        }
        this.bonus = bonus;
    }
}

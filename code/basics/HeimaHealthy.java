package com.itheima.healthy;

import java.util.Scanner;

public class HeimaHealthy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入身高（cm）：");
        short height = scanner.nextShort();
        System.out.print("请输入体重（kg）：");
        double weight = scanner.nextDouble();
        System.out.print("请输入年龄：");
        byte age = scanner.nextByte();
        System.out.print("请输入性别（0:男/1:女）：");
        byte gender = scanner.nextByte();
        System.out.print("请输入活动级别（0:久坐/1:轻度/2:中度/3:高度）：");
        byte activityLevel = scanner.nextByte();
        System.out.println("用户信息如下：");
        System.out.println("身高：" + height + "cm");
        System.out.println("体重：" + weight + "kg");
        System.out.println("年龄：" + age + "岁");
        String genderStr = (gender == 0) ? "男" : "女";
        System.out.println("性别：" + genderStr);
        String activityLevelStr = switch (activityLevel) {
            case 0 -> "久坐";
            case 1 -> "轻度运动";
            case 2 -> "中度运动";
            default -> "高度运动";
        };
        System.out.println("活动级别：" + activityLevelStr);
        // 计算BMI指数，公式为：体重(kg) / 身高(m)的平方
        // 其中身高需要从厘米转换为米单位
        double bmi = weight / Math.pow(height / 100.0, 2);
        System.out.printf("BMI：%.1f%n", bmi);
        String bodyType;
        if (bmi < 18.5) {
            bodyType = "偏瘦";
            System.out.println("身体类型：" + bodyType);
        }
        else if (bmi >= 18.5 && bmi < 25) {
            bodyType = "正常";
            System.out.println("身体类型：" + bodyType);
        }
        else if (bmi >= 25 && bmi < 30) {
            bodyType = "过重";
        }
        else {
            bodyType = "肥胖";
        }
        System.out.println("身体类型：" + bodyType);
        //设定运动目标
        String goal = switch (bodyType) {
            case "偏瘦" -> "增肌";
            case "过重", "肥胖" -> "减重";
            default -> "保持";
        };
        System.out.println("运动目标：" + goal);
        }
}

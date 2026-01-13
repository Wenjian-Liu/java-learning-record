package com.itheima.demo3stream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
	public static void main(String[] args) {
		// 目标：掌握Stream流中常用的中间方法，对流上的数据进行处理（返回新流，支持面试编程）
		List<String> list = new ArrayList<>();
		list.add("张无忌");
		list.add("周芷若");
		list.add("赵敏");
		list.add("张强");
		list.add("张三丰");
		list.add("张翠山");

		// 1. 过滤方法
		list.stream().filter(name -> name.startsWith("张") && name.length() == 3).forEach(name -> System.out.println(name));

		// 2. 排序方法
		List<Double> scores = new ArrayList<>();
		scores.add(99.9);
		scores.add(66.6);
		scores.add(33.3);
		scores.add(77.7);
		scores.add(77.7);
		scores.add(55.5);

		scores.stream().sorted().forEach(System.out::println);
		System.out.println("------------------------");
		scores.stream().sorted((s1, s2) -> Double.compare(s2, s1)).limit(2).forEach(System.out::println); // 只要前2名
		System.out.println("------------------------");
		scores.stream().sorted((s1, s2) -> Double.compare(s2, s1)).skip(2).forEach(System.out::println); // 不要前2名
		System.out.println("------------------------");
		// 如果希望自定义对象能够去重复，重写对象的hashCode和equals方法
		scores.stream().sorted((s1, s2) -> Double.compare(s2, s1)).distinct().forEach(System.out::println); // 去重
		System.out.println("------------------------");

		// 加工方法，把流上原来的数据拿出来，变成新数据又放到流上去
		scores.stream().map(s -> "加10分后：" + (s + 10)).forEach(System.out::println);

		// 合并流
		Stream<String> s1 = Stream.of("张三丰", "张无忌", "张翠山", "张良", "张学友");
		Stream<Integer> s2 = Stream.of(100, 90, 180, 70, 66);

		Stream<Object> s3 = Stream.concat(s1, s2);

		System.out.println(s3.count());
	}
}

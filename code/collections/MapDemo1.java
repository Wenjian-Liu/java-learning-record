package com.itheima.demo2map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		// 目标：掌握Map的常用方法
		Map<String, Integer> map = new HashMap<>();  // 经典代码
		map.put("张三", 23);
		map.put("王五", 25);
		map.put("赵六", 26);
		// System.out.println(map.put("张三", 27));
		map.put("张三", 25);
		map.put("李四", 28);
		map.put(null, null);
		System.out.println(map);

		// 写代码展示常用方法
		System.out.println(map.get("张三"));  //根据键取值
		System.out.println(map.containsKey("张三"));
		System.out.println(map.containsValue(25));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.remove("李四"));
		System.out.println(map.size());

//		map.clear();
//		System.out.println(map);

		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());

	}
}

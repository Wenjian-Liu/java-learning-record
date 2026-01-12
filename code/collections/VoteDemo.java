package com.itheima.demo2map;

import java.util.*;

public class VoteDemo {
	public static void main(String[] args) {
		// 目标：统计哪个景点想去的人数最多
		calc();
	}

	public static void calc() {
		// 1. 将80个人选择的数据拿到程序中去
		List<String> locations = new ArrayList<>();
		String[] names = {"玉龙雪山", "长城", "少林寺", "丽江"};
		Random r = new Random();
		for (int i = 0; i < 80; i++) {
			int index = r.nextInt(names.length);
			locations.add(names[index]);
		}
		System.out.println(locations);

		// 2. 准备一个Map集合用于储存统计的结果，Map<String, Integer>，键是景点，值代表投票数量
		Map<String, Integer> map = new HashMap<>();

		// 3. 遍历80个人选择的景点，每遍历一个景点，就看Map集合中是否存在该景点，不存在存入“景点=1”，存在则将值+1
		for (String location : locations) {
			// 4. 遍历Map集合，得到景点和投票数量，并判断哪个景点的投票数量最多
//			if (map.containsKey(location)) {
//				Integer count = map.get(location);
//				count++;
//				map.put(location, count);
//			} else {
//				map.put(location, 1);
//			}
			map.put(location, map.containsKey(location) ? map.get(location) + 1 : 1);
		}
		map.forEach((key, value) -> {
			System.out.println(key + "被选择了" + value + "次");
		});
	}
}

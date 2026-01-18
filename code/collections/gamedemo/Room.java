package com.itheima.demo4test;

import java.util.*;

public class Room {
	// 1. 准备好54张牌，给房间使用：定义一个集合容器装54张牌
	private List<Card> allCards = new ArrayList<>();
	// 2. 初始化54张牌进去
	{
		// 3. 准备点数
		String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		// 4. 准备花色
		String[] colors = {"♠", "♥", "♣", "♦"};
		// 5. 组合点数和花色成为牌对象，加入到集合中去
		int num = 0;
		for (String size : sizes) {
			num++;
			for (String color : colors) {
				// 6. 创建牌对象
				Card card = new Card(size, color, num);
				// 7. 添加到集合中
				allCards.add(card);
			}
		}
//		allCards.add(new Card("", "小王"));
//		allCards.add(new Card("", "大王"));
		Collections.addAll(allCards, new Card("", "小王", ++num), new Card("", "大王", ++num));
		System.out.println("新牌是：" + allCards);
	}
	public void start() {
		// 8. 洗牌：随机排序集合
		Collections.shuffle(allCards);
		System.out.println("洗牌后：" + allCards);

		// 9. 发牌：定义三个玩家：令狐冲=【】、令狐白=【】、令狐黄=【】
		Map<String, List<Card>> players = new HashMap<>();

		List<Card> lhc = new ArrayList<>();
		players.put("令狐冲", lhc);

		List<Card> lhb = new ArrayList<>();
		players.put("令狐白", lhb);

		List<Card> lhh = new ArrayList<>();
		players.put("令狐黄", lhh);

		// allCards = [54张牌]
		// 只发出去51张牌
		for (int i = 0; i < allCards.size() -3; i++) {
			// 获取到当前遍历的牌
			Card card = allCards.get(i);
			// 判断当前这张牌发给谁
			if (i % 3 == 0) {
				lhc.add(card);
			} else if (i % 3 == 1) {
				lhb.add(card);
			} else if (i % 3 == 2){
				lhh.add(card);
			}
		}

		// 10. 拿最后三张底牌
		List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size());
		System.out.println("底牌是：" + lastCards);

		// 抢地主：把这个集合直接发给玩家
		lhh.addAll(lastCards); // 令狐黄拿到底牌

		// 11. 对牌排序
		// 对所有人收到的牌进行从大到小排序，其中大王>小王>2>A>K>Q>J>10>9>8>7>6>5>4>3
		sortCards(lhc);
		sortCards(lhb);
		sortCards(lhh);

		// 12. 看牌：遍历Map集合
		for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
			// 获取到玩家名称
			String name = entry.getKey();
			// 获取到玩家牌
			List<Card> cards = entry.getValue();
			// 遍历玩家牌
			System.out.println(name + "的牌是：" + cards);
		}

	}

	private void sortCards(List<Card> cards) {
		Collections.sort(cards, new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
				return o2.getNum() - o1.getNum();
			}
		});
	}
}

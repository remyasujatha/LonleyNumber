package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LonleyTest {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 2));
		System.out.println(lonelyinteger(list));

	}

	public static int lonelyinteger(List<Integer> checkList) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Integer lonleyValue = null;
		for (Integer item : checkList) {
			int count = 0;
			if (map.containsKey(item)) {
				count = map.get(item);
			}
			map.put(item, ++count);
		}
		for (Integer item : map.keySet()) {
			if (map.get(item) == 1) {
				lonleyValue = item;
			}
		}
		return lonleyValue;
	}

}

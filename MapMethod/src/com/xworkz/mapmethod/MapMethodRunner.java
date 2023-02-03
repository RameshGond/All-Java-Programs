package com.xworkz.mapmethod;

import java.util.HashMap;
import java.util.Map;

public class MapMethodRunner {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		numbers.put("satya", 100);
		numbers.put("ramesh", 101);
		numbers.put("suraj", 102);
		numbers.put("srinath", 103);
		numbers.put("nikhil", 104);

		System.out.println(numbers.size());
		System.out.println(numbers.isEmpty());
		System.out.println(numbers.containsKey("satya"));
		System.out.println(numbers.containsValue(100));
		System.out.println(numbers.get("suraj"));
		System.out.println(numbers.replace("raghu", 105));
	}

}

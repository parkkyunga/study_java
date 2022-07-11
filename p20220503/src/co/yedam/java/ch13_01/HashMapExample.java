package co.yedam.java.ch13_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 entry 수 : " + map.size());
		System.out.println("\t홍길동 : " + map.get("홍길동"));
//		System.out.println(map.toString());
		System.out.println();

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {// 값이있으면
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		map.remove("홍길동");
		System.out.println("총 entry 수 : " + map.size());

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		System.out.println();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("\t" + key + " : " + value);

		}

	}
}
package day007;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapBianli {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("һһ", 11);
		map.put("����", 22);
		map.put("����", 33);
		map.put("����", 44);
		map.put("����", 55);
		System.out.println("��һ�α���:");
		//����key
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		//����value
		for (Integer value : map.values()) {
			System.out.println(value);
		}
		System.out.println("�ڶ��α���:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			//System.out.println(entry);
			System.out.println("key="+entry.getKey()+",value="+entry.getValue());
		}
		System.out.println("�����α���:");
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry3 = it.next();
			System.out.println(entry3);
		}
		System.out.println("���Ĵα���:");
		Iterator<Entry<String, Integer>> it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> entry3 = it2.next();
			String key = entry3.getKey();
			Integer value = entry3.getValue();
			System.out.println(key+value);
		}
	}
}

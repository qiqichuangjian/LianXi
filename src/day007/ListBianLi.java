package day007;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListBianLi {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		System.out.println("��һ�ֱ���:");
		for (int i = 0; i < list.size(); i++) {
			Object object1 = list.get(i);
			System.out.println(object1);
		}
		System.out.println("�ڶ��ֱ���:");
		for (Object object2 : list) {
			System.out.println(object2);
		}
		System.out.println("�����ֱ���:");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object object3 = it.next();
			System.out.println(object3);
		}
		System.out.println("�����ֱ���:");
		ListIterator listIt = list.listIterator();
		while(listIt.hasNext()) {
			Object object4 = listIt.next();
			System.out.println(object4);
		}
	}
}

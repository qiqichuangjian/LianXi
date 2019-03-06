package day007;

import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class SetBianLi {
	public static void main(String[] args) {
		Set set = new TreeSet();
        set.add(7);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(6);
        System.out.println("第一次遍历:");
        for (Object object2 : set) {
			System.out.println(object2);
		}
        System.out.println("第二次遍历:");
        Iterator it = set.iterator();
        while(it.hasNext()) {
        	Object object3 = it.next();
        	System.out.println(object3);
        }
	}

}

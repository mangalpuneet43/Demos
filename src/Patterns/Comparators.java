package Patterns;

import java.util.TreeSet;

public class Comparators {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator());
		
		t.add(10);
		t.add(5);//compare(5,10)
		t.add(15);
		t.add(20);
		
		System.out.println(t);
		

	}

}

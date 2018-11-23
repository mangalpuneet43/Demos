package Patterns;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class SetDemo {

	public static void main(String[] args) {

		int []arr= new int[] {10,5,25,35,45,89};
		SortedSet<Integer> s = new TreeSet<Integer>();
		
		for(int a: arr)
		{
			s.add(a);
		}
		
		System.out.println(s.add(25));
		
	System.out.println(s);
	
	 Vector v = new Vector();
	
	Enumeration e = v.elements();

	}

}

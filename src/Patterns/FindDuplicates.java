package Patterns;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {

		String str="Puneet Kumar Mangal Kumar Mangal";
		
		String[] arr=str.split(" ");
		Set<String> s = new HashSet<String>();
		
		for(String b: arr)
		{
			if(s.add(b)==false)
			{
				System.out.println("Duplicate is"+b);
			}
		}

	}

}

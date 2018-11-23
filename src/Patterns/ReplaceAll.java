package Patterns;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String s= "Java Puneet Kumar Mangal";
		
		String[] arr=s.split(" ");
		String finals="";

		
		
		for(String word : arr)
		{
			String reverse="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse=reverse+word.charAt(i);
			}
			finals=finals+reverse+" ";
			
		}
		System.out.println(finals);

	}

}

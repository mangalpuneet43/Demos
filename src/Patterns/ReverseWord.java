package Patterns;

public class ReverseWord {

	public static void main(String[] args) {

		String str="Puneet Kumar Mangal";
		
		String words[]=str.split(" ");
		String reverse="";
		System.out.println();
		for(int i=words.length-1;i>=0;i--)
		{
			String word=words[i];
			System.out.println(word);
			for(int j=0;j<word.length();j++)
			{
				reverse=reverse+word.charAt(j);
			}
			reverse=reverse+" ";
			
		}
		System.out.println(reverse);

	}

}

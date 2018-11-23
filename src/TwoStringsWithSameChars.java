import java.util.Arrays;

public class TwoStringsWithSameChars {

	public static void main(String[] args) {
	
		
		String s1="Puneet";
		String s2="tuPeen";
		
		
		if(s1.length()!=s2.length())
		{
			System.out.println("String are not created with same characters");
		}
		
		else
		{
		
		char[]s1c=s1.toCharArray();
		char[]s2c=s2.toCharArray();
		
		Arrays.sort(s1c);
		Arrays.sort(s2c);
		
		System.out.println(s1c);
		System.out.println(s2c);
		
		if(Arrays.equals(s1c, s2c))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		}
		

	}

}

import java.util.ArrayList;

public class NonRepeatedCharacters {



	public static void main(String[] args) {
		
		String str="abcaa";
		char []c1=str.toCharArray();
		ArrayList<Character> arr= new ArrayList<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c=c1[i];
			if(arr.contains(c))
				continue;
			
			
			for(int j=i+1;j<str.length();j++)
			{
				if(c==c1[j])
				{
					arr.add(c);
					break;
				}
				else if(j==c1.length-1)
				{System.out.println(c);
					break;
				}
		        
			}
		}
	}

		
}




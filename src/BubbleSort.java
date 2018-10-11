import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
    
		ArrayList<String> s= new ArrayList<String>(Arrays.asList("Puneet","Kumar","Mangal"));
		
		int n=s.size();
		String temp="";
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(s.get(j-1).compareTo(s.get(j))>0)
				{
					temp=s.get(j-1);
					s.set(j-1,s.get(j));
					s.set(j,temp);
					
					
				}
			}
			
			
		}
		
		System.out.println(s);

	}

}

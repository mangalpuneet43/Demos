
public class Overiding 
{
	
	public static void main(String args[])
	{
		String s1="Puneet Kumar Mangal";
		int k=0;
		String reverse="";	
        int n= s1.length()-1;
		
		for(int i=n;i>=0;i--)
		{
			if(s1.charAt(i)==' ')
			{
				int j=i+1;
				while(k>0)
				{
			    reverse=reverse+s1.charAt(j++);
			    k--;
				}
				k=0;
				
			}
			else
				k++;
			reverse=reverse+" ";
		}
		System.out.println(reverse);
	}
	

}

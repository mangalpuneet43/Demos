package Patterns;

public class MissingNumber {

	
	public static void Missing(int []a)
	{
		int current=1;
		
		for(int i=0;i<a.length;i++)
		{
		
		if(a[i]!=current)
		{
			for(int j=current;j<a[i];j++)
			{
				System.out.println("Print missing number"+j);
			}
		}
		
		current=a[i]+1;
		}
	}
	public static void main(String[] args) {
		
		int []a=new int[] {1,4,5,8,9,19};
		
		Missing(a);

		


	}

}

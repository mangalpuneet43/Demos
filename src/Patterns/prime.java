package Patterns;

public class prime {

	public static void main(String[] args) {
	
		
		int n=7;
		
		boolean flag=true;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(!flag)
			System.out.println("Number Not a prime Number");
		
		else
			System.out.println("Number is a prime Number");
			

	}

}

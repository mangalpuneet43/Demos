package Patterns;

public class MissingOneNumber {
	
	public static int fib(int n)
	{
		
		 if(n==0|n==1)
			return n;
		
		else
			return fib(n-2)+fib(n-1);
	}

	public static void main(String[] args) {
for(int i=1;i<=8;i++)
{
System.out.println("fibonnacci of"+i+"is "+fib(i));
}
	}

}

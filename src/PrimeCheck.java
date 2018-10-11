
public class PrimeCheck {

	public static void main(String[] args) {

		
		int num=21;
		boolean flag=false;
		
		for(int j=2;j<num/2;j++)
		{
			if(num%j==0)
			{
				flag=true;
				break;
			}
				
		}
		if(flag==false)
		{
			System.out.println(num+"is prime");
		}
		else
			System.out.println("Number is not a prime number");

	}

}

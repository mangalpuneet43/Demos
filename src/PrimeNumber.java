
public class PrimeNumber {

	public static void main(String[] args) {

    String primeNumber="";

    
    for(int i=1;i<=200;i++)
    {
        int counter=0;
    	for(int j=i;j>=1;j--)
    	{
    		if(i%j==0)
    		{
    			counter++;
    		}
    	}
    	if(counter==2)
    	primeNumber=primeNumber+" "+i;
    }
    
    System.out.println(primeNumber);

	}

}

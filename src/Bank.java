
public abstract class Bank {
	
	int a=10;
	static int b=10;
	final int c=10;

	public void credit()
	{
		System.out.println("Abstract Credit Method");
	}
	public void debit()
	{
		System.out.println("Abstract Debit Method");
	}
	
	public abstract void Loan();


}



	



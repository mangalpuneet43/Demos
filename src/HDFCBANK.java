
public class HDFCBANK extends Bank {
	@Override
	public void Loan() {
		
		
		System.out.println("Loan method");
		
	}
	public void credit()
	{
		System.out.println("Credit Method");
	}
	public void debit()
	{
		System.out.println("Debit Method");
	}
	public void theftSafety()
	{
		System.out.println("theftsafety Method");
	}

	

	public static void main(String[] args) {

		HDFCBANK b= new HDFCBANK();
		b.credit();
		b.debit();
		b.Loan();
		b.theftSafety();//compile time binding static polymorphism.

        //Run Time Polymorphism
		
		Bank s= new HDFCBANK();//Top Casting
		s.credit();
		s.debit();
		s.Loan();
    
	
	}

}
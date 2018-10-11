
public class ICICIBANK implements USBANK {

	public static void main(String[] args) {

		ICICIBANK b= new ICICIBANK();
		b.credit();
		b.debit();
		b.loan();
		b.theftSafety();
	    USBANK b1= new ICICIBANK();
	

	}

	@Override
	public void credit() {

		System.out.println("Credits");
		
	}

	@Override
	public void debit() {
		System.out.println("Debits");
		
	}

	@Override
	public void loan() {
		System.out.println("Loans");
		
	}
	public void theftSafety() {
		System.out.println("theftSafety");
		
	}

}

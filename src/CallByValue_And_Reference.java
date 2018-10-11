
public class CallByValue_And_Reference {
	int x;
	int y;
	int temp=0;

	public static void main(String[] args) {
	    int x=10;
	    int y=15;
		CallByValue_And_Reference ce= new CallByValue_And_Reference();
		
                  System.out.println(ce.sum(x, y));
                  ce.x=50;
                  ce.y=60;
                  System.out.println(ce.x+" "+ce.y);
                  ce.swap(ce);
                  System.out.println(ce.x+" "+ce.y);
                   
	}
	
	
	public int sum(int a,int b)
	{
		 a=20;
		 b=30;
		return a+b;
	}
	
	public CallByValue_And_Reference swap(CallByValue_And_Reference r)
	{
		temp=r.x;
		r.x=r.y;
		r.y=temp;
		return r;
	}

}

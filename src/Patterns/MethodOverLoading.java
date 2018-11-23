package Patterns;

 class MethodOverLoading{
	
	   static int num=0;
	    String mystr;
	   //First Static block
	 
	   
	   public  static void f1()
	   {
		   System.out.println(num);
	   }
	   public void f2()
	   {
		   System.out.println(mystr);
	   }
	  public static void main(String args[])
	  {
	   
		  
		 
		  MethodOverLoading l1=new MethodOverLoading();
		  f1();
		  l1.f2();
	   }
 

	
		
		
	
 
	}
 




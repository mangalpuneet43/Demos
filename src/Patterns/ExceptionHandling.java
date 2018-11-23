package Patterns;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		
		try
		{
			int c=10/0;
			System.out.println("Puneet");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
			try{
				int a=Integer.parseInt("Puneet");
			   }
			catch(Exception e1)
			{
				System.out.println(e1.getMessage());
			}
			finally
			{
				System.out.println("Not Happy");
			}
		}
		finally
		{
			System.out.println("Happy");
		}

	}

}

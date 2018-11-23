package Patterns;

public class ClassNotFound {
	private static final String CLASSTOLOAD = "Patterns.Pattern1";
	public static void main(String[] args) {
	

		   try {
			   
			               Class loadedClass = Class.forName(CLASSTOLOAD);
			   
			               System.out.println("Class " + loadedClass + " found successfully!");
			  
			           }
			  
			           catch (ClassNotFoundException ex) {
			  
			               System.err.println("A ClassNotFoundException was caught: " + ex.getMessage());
			  
			               ex.printStackTrace();
			   
			           }

	}

}

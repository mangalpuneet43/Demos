package Patterns;

public class pallindromes {
	


	public static void main(String[] args) {
	String s="MADA";
	int j=0;
    for(int i=s.length()-1;i>=0;i--)
    {
    	if(s.charAt(i)==s.charAt(j))
    		i++;
    	
    	else
    	{
    		System.out.println("Not Pallindrome");
    		break;
    	}
    
    	
    	if(i>j)
    	{
    		System.out.println("Pallindrome");
    	break;
    	}
    }
    	
    		
    }
	}



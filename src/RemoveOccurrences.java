
public class RemoveOccurrences {

	public static void main(String[] args) {
		
		String s= "abdfabcdeeefrty";
		char c='f';
		String result="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='f')
		result=s.replaceAll(s.charAt(i)+"","");
			
			result=s.replaceAll(String.valueOf(c),"");
		}
		
         System.out.println(result);
	}

}

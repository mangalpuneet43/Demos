
public class Pallindrome {

	public static void main(String[] args) {

           String s="DVDLDVD";
           int i=0;
          for(int j=s.length()-1;j>=0;j--)
{
	if(s.charAt(i)==s.charAt(j))
	{
		i++;
	}
	else
	{
		System.out.println("String is not in Pallindrome");
	     break;
	}
	
	if(i>j)
	{
		System.out.println(s+" is Pallindrome");
		break;
	}
}

	}

}

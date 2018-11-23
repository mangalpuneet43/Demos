package Patterns;

public class largeSmall {

	public static void main(String[] args) {
	
		int arr[]= new int[] {10,20,50,45,4};
		int l=arr[0];
		int s=arr[0];
	
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>l)
				l=arr[i];
			
			else
				s=arr[i];
			
		}
		
		
		System.out.println(l+""+s);

	}

}

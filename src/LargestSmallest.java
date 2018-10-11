import java.util.Arrays;

public class LargestSmallest {

	public static void main(String[] args) {
    
		int arr[]= new int[] {10,20,30,40,50,4};
		
		int l=arr[0];
		int s=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>l)
				l=arr[i];
			
			else if(arr[i]<s)
				s=arr[i];
		}
System.out.println(s+"     "+l);

System.out.println(Arrays.toString(arr));

	}

}

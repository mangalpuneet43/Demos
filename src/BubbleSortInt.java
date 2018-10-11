import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortInt {

	public static void main(String[] args) {
 int[] arr= new int[5];
 int temp=0;
 
 Scanner sc = new Scanner(System.in);
 for(int i=0;i<5;i++)
 {
	 arr[i]=sc.nextInt();
	 
 }
 System.out.println(Arrays.toString(arr));
 
 for(int i=0;i<arr.length;i++)
 {
	 for(int j=1;j<arr.length-i;j++)
{
		 if(arr[j-1]>arr[j])
		 {
	     temp=arr[j-1];
		 arr[j-1]=arr[j];
		 arr[j]=temp;
}}
 }
 
 System.out.println(Arrays.toString(arr));
	}

}

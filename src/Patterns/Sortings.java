package Patterns;

import java.util.Arrays;

public class Sortings {

	public static void main(String[] args) {

		
		int [] arr= {10,4,20,23,5};
		
		int n=arr.length;
		int temp=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}

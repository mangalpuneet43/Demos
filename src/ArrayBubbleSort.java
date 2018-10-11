import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		String temp;
	
		String [] b_sort= {"Puneet","Kumar","Mangal"};
		
		for(int i=0;i<b_sort.length;i++)
		{
			for(int j=1;j<(b_sort.length)-i;j++)
			{
				if(b_sort[j-1].compareTo(b_sort[j])>0)
				{
					temp=b_sort[j-1];
					b_sort[j-1]=b_sort[j];
					b_sort[j]=temp;
				}
			}
		}
		for(String s: b_sort)
		{
		System.out.println(s);
		}
		System.out.println(Arrays.toString(b_sort));

	}

}

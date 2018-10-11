package Patterns;

public class Pattern8 {

	public static void main(String[] args) {


		for(int i=1;i<=7;i++)
		{
			int k=7;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k--+" ");
			}
			System.out.println();
		}

	}

}

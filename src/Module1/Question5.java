package Module1;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		
		int i,j,a;
		System.out.print("Enter a number of rows : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
			for(i=1; i<=5; i++)
			{
				for(j=1; j<=i; j++)
				{
					System.out.print(j);
					
				}
				System.out.println();
			}
			
	}
}

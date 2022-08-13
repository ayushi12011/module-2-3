package Module1;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		int i,j=0,sum=0;
		float avg;
		{
			System.out.println("Input the 5 number : ");
		}
		for(i=1; i<=5; i++)
		{
				Scanner sc = new Scanner(System.in);
				j = sc.nextInt();
				
				sum +=j;
		}
		avg = sum/5;
		System.out.println("The sum of 5 no is : "+sum);
		System.out.println("The average is : "+avg);
	}
}

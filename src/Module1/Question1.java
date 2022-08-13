package Module1;

import java.util.Scanner;

public class Question1 {
		public static void main(String[] args) {
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a = ");
			a = sc.nextInt();
			
			System.out.println("enter b = ");
			b = sc.nextInt();
			
			System.out.println("enter c = ");
			c = sc.nextInt();
			
			if(a>b)
			{
				if(a>c)
				{
					System.out.println("A is greater");
				}
				else
				{
					System.out.println("C is greater");
				}
			}
			else if(b>c)
			{
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		
		}
}

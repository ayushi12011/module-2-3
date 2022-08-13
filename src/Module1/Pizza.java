package Module1;

import java.util.Scanner;

public class Pizza {
	
	public static void main(String[] args) {
	
		System.out.println("Wellcome to pizza shop");
		Scanner sc = new Scanner(System.in);
		String size;
		int i;
		
		System.out.println("Enter size of pizza:  ");
		size = sc.nextLine();
		System.out.println("Enter qut : ");
		i = sc.nextInt();
		
		if(size.equalsIgnoreCase("Small"))
		{
			if(i == 4)
			{
				System.out.println("You get 500ml coke free");
			}
			else
			{
				System.out.println("no offer");
			}
		}
		if(size.equalsIgnoreCase("Medium"))
		{
			if(i == 6)
			{
				System.out.println("You get 1 liter coke free");
			}
			else
			{
				System.out.println("no offer");
			}
		}
		if(size.equalsIgnoreCase("Large"))
		{
			if(i == 10)
			{
				System.out.println("You get 1 liter coke and ice cream free");
			}
			else
			{
				System.out.println("no offer");
			}
		}
		if(size.equalsIgnoreCase("Moster"))
		{
			if(i == 12)
			{
				System.out.println("You get 1 liter coke, ice cream and brownic free");
			}
			else
			{
				System.out.println("no offer");
			}
		}
		//else
		//{
			//System.out.println("Enter a right size");
		//}
	}
}

package Module1;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		int n=0,i=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input an integer number less than ten billion : ");
		n = sc.nextInt();
		
		while(n>0)
		{
			n = n/10;
			i = i+1;
		}
		System.out.println("/n Number of digits in the number = %d"+i);
	}
}
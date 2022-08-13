package Module1;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		//char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any charcter:");
		char ch = sc.next().charAt(0);
		
		if ((ch=='a' || ch=='A') || (ch=='e' || ch=='E') || (ch=='i' || ch=='I') || (ch=='o' || ch=='O') || (ch=='u' || ch=='U')) {
			System.out.println("Entered character is vowel");
		}
		else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ) {
			System.out.println("Entered character is consonent");
		}
		else {
			System.out.println("This is not a vowel or consonent");
		}
	}
}

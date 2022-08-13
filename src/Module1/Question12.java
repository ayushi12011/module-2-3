package Module1;

import java.util.Iterator;

public class Question12 {
	public static void main(String[] args) {
		System.out.println("\n Divisible by 3: ");
		for(int i=1; i<100; i++) {
			if (i%3==0) {
				System.out.println(i+" ,");
			}
		}
		System.out.println("\n Divisible by 5: ");
		for(int i=1; i<100; i++) {
			if (i%5==0) {
				System.out.println(i+" ,");
			}
		}
		System.out.println("\n Divisible by both: ");
		for(int i=1; i<100; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println(i+" ,");
			}
		}
	}
}

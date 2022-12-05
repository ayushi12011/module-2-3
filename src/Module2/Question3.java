package Module2;

public class Question3 {
	public static void main(String[] args) {
		String str1 = "Topsint.com"; 
		String str2 = "topsint.com";
		CharSequence cs ="Topsint.com";
		
		System.out.println("Comparing "+ str1 +" and "+ cs +": " + str1.contentEquals(cs));
		System.out.println("Comparing "+ str2 +" and "+ cs +": " + str2.contentEquals(cs));
	}
}

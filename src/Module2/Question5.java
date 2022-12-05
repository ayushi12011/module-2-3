package Module2;

public class Question5 {
	public static void main(String[] args) {
		String str1 = "Red is favourite color";
		String str2 = "Orange is also my favorite color";
		
		//if they start with this value (Red).
		String start = "Red";
		
		//Check first two string end with end_str
		boolean a1 = str1.startsWith(start);
		boolean a2 = str2.startsWith(start);
		
		System.out.println("\"" + str1 + "\" starts with " + "\"" + start + "\"? " + a1);
		System.out.println("\"" + str2 + "\" starts with " + "\"" + start + "\"? " + a2);
	}
}

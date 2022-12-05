package Module2;

public class Question8 {
	public static void main(String[] args) {
		Question8 obj = new Question8();

        obj.printn(5);

        obj.printn(5.5);

        obj.printn("123");

        obj.printn('A');

        obj.printn(10.444);

    }

    void printn(int a){

        System.out.println("Integer: " +a);

    }

    void printn(float a){

        System.out.println("float: " +a);

    }

    void printn(String a){

        System.out.println("String: " +a);   

    }

    void printn(char a){

        System.out.println("Char: " +a);

    }

    void printn(double a){

        System.out.println("Double: " +a);

    

    }
	
}


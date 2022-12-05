package Module2;

//public class Question16 {

//	    public static void main(String[] args) {
//	    	Question16 s1 = new Question16();
//	        s1.message();
//	        subclass2 s2 = new subclass2();
//	        s2.message();
//	    }

	abstract class Parent{

	    public abstract void message(); 
	} 

	class subclass1 extends Parent{

	    @Override

	    public void message(){

	        System.out.println("This is first subclass: ");

	    }
	}

	class subclass2 extends Parent{

	    @Override

	    public void message(){

	        System.out.println("This is Second subclass: ");

	    }
	}
	public class Question16 {
	public static void main(String[] args) {
    	subclass1 s1 = new subclass1();
        s1.message();
        subclass2 s2 = new subclass2();
        s2.message();
    }
}

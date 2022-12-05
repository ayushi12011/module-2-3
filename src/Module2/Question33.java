package Module2;

public class Question33 extends Thread { 
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
		Question33 t1=new Question33();  
		t1.start();  
		 }    
}

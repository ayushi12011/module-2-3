package Module2;

public class Question35 extends Thread{  
	 public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
		  Question35 t1=new Question35();  
		  t1.start();  
		  t1.start();  
		 }  
		} 
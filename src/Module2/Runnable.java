package Module2;

public interface Runnable {
	Runnable runnable = new MyRunnable();    
	  
	Thread thread = new Thread(runnable);  
	Thread.State();  
}

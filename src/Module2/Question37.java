package Module2;

public class Question37 extends Thread
{
    public Question37(String name){
        super(name);
    }
  
    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
          
        else
        {
            System.out.println(getName() + " is User thread");
        }
    }
      
    public static void main(String[] args)
    {
      
    	Question37 t1 = new Question37("t1");
    	Question37 t2 = new Question37("t2");
    	Question37 t3 = new Question37("t3");
      
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();        
    }
}

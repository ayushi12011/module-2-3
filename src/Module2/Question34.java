package Module2;

public class Question34 {
	public static void main(String[] args)
    {
        // we can also use throws keyword followed by
        // exception name for throwing the exception
       
        try {
            for (int i = 0; i < 5; i++) {
               
                // it will sleep the main thread for 1 sec
                // ,each time the for loop runs
                Thread.sleep(2000);
               
                // printing the value of the variable
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}

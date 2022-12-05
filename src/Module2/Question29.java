package Module2;

public class Question29 {
	 public static void main(String arg[])

     {

           try

           {

                 int age=Integer.parseInt(arg[0]);

                 if(age<16)

                       throw new ArithmeticException("Invalid Age Exception");

                 else

                       System.out.println("Welcome To The Group Of Votes");

           }

           catch(Exception e)

           {

                 System.out.println(e);

           }

           System.out.println("not valid");

     }

}

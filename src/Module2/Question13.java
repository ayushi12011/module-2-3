package Module2;

//public class Question13 {
	   
public class rectangle{
		int length,breadth;
		public rectangle(int l, int b)
		{        
			length = l;
			breadth = b;
		}    
		void print_area()
		{        
			System.out.println(length*breadth);
		}    
		void print_perimeter()
		{        
			System.out.println(2*(length+breadth));
			class Square extends rectangle
			{    
				public Square(int s)
				{
					super(s, s);
				}
			}
public class Question13 {  
				public static void main(String[] args)
				{       
					rectangle r = new rectangle (4,5);
					Square s = new Square (4);
					r.print_area();
					r.print_perimeter();
					s.print_area();
					s.print_perimeter(); 
				}
			}
		}
}
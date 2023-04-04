package encapsulation;

public class Class_P
{
	
	public static void main(String[] args) 
	{
		Class_A a=new Class_A();
		a.display_link();
		a.show_var();
		//a.x=90;//not possible(Class_A var is private)
		
		int z;
		 
		int y=400;
		
		int s=a.show_var();//perform operation with var of Class_A
		
		
		
		
		
		z=s+y; 
		//z=y+a.show_var();
		 System.out.println(z);
	     s=90;//we can change value of local var of this class.
		 

			//Class_A.c;//not visible(private)
	     //Class_A.show_float();
	    float v=1.4f;
	     float b= Class_A.show_float();
	     float add= v + Class_A.show_float();
	     System.out.println(add);
	     add=v+b;
	     System.out.println(add);
	    // System.out.println(a.c);
	    // a.show_float();
	     
	}

}

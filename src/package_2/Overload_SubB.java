package package_2;
public class Overload_SubB extends Overload_A //inheritance
{
	 public static void show(double a,double b)// static method((overloaded)
	   {
		  double c=a*b;
		  System.out.println("sub class static method with 2 argument: "+ c );
	   }
	
	public  void shownst(double a,int b)//nonstatic method(overloaded)//
	   {
		 double d=a+b;
		  System.out.println("sub class nonstatic method with 3 argument: "+ d );
	   }
	
	public static void main(String[] args) 
	{
		 show(0.2,0.8);//subclass static method
         show(5,2);//calling overloaded  static method from Overload_A (superclass)
	     System.out.println("_______________________________________________"  );
		 
	     Overload_SubB b=new  Overload_SubB();//obj of Overload_SubB
		 b.shownst(0.1,9);//subclass nonstatic method
		 b.shownst(5,2,9);//calling overloaded  non-static method from Overload_A (superclass)
		
		
	}

}




/*METTHOD OVERLOADING
 * 1.(show())when BOTH METHODS are STATIC but with DIFF ARGS.
and METHOD NAME must be SAME and present in SAME CLASS. 
 
 2.in java memory ,declaration of method will store in static pool area only one time 
for memory management but 2 body(def) will store in method area for same method.
while calling in main method,it will identify on basis of diff arg 
still method name is same.
 
3.in java memory ,declaration of method will store in heap area only one time 
for memory management but 2 body(def) will store in method area for same method.
while calling in main method,it will identify on basis of diff arg 
still method name is same. 

4.NOT POSSIBLE when ONE METHOD is STATIC and OTHER is NONSTATIC.

*/
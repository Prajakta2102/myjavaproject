package package_2;
public class Overload_A 
{
	//static method
	public static void show(int a,int b)//1st static method
   {
	  int c=a*b;
	  System.out.println("supeclass static method with 2 argument: "+ c );
   }
  
   public static void show(int a,int b,int c)//2nd static method(overloaded)//
   {
	  int d=a*b*c;
	  System.out.println("2nd static method with 3 argument: "+ d );
   }
  
  // nonstatic method
   public void shownst(int a,int b)//1st nonstatic method
   {
	  int c=a+b;
	  System.out.println("superclass nonstatic method with 2 argument: "+ c );
   }
  
   public  void shownst(int a,int b,int c)//2nd nonstatic method(overloaded)//
   {
	  int d=a+b+c;
	  System.out.println("superclass nonstatic method with 3 argument: "+ d );
   }
  
   
   
   
   
   /* public  void shownst(double a,int b)//3rd nonstatic method(overloaded)//
   {
	  double d=a+b;
	  System.out.println("2nd nonstatic method with 3 argument: "+ d );
   }*/
      public static void main(String[] args)
	{
	   //method overloading when both methods are static 
		show(10,30);//calling 1st static method with 2 arg
		show(3,5,2);//calling 1st static method with 3 arg

		System.out.println("_____________________________________" );
		//method overloading when both methods are non-static 
		Overload_A a=new  Overload_A ();//obj 
		a.shownst(10,30);//calling 1st nonstatic method with 2 arg
		a.shownst(3,5,2);//calling 2st nonstatic method with 3 arg*/
        //a.shownst(0.2,2);//calling 3rd nonstatic method with 2 arg(double,int)

	}

}


package exception_Handling;

public class ExceptionClass 
{

	/*static void demo(String a)
	{
		System.out.println("Hi");
		if(a.equals("end"))
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	static String s;
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c=0;
		try
		{
			System.out.println("try started");
			System.out.println(s.charAt(1));
			System.out.println("try ended");
			
		}

		catch(ArithmeticException e)
		{
			System.out.println("you have entered value of b as"+b+"which is incorrect operation is not allowed");
			//alternative code
		}
		catch(NullPointerException e)
		{
			System.out.println("you are trying to access null String");
		}
		
		finally
		{
			System.out.println("this is end of our program");
		}
	}*/

	/*public static void main(String args[])
	{
	int a=2,b=0;
	 
	try
	{
		
		
		 String s=null;
		
		System.out.println(s.toLowerCase());
	
	}
		
	
	 catch(NullPointerException e)
	{
		
		 System.out.println(e); 
	}
	try
	{
		int c=a/b;
		System.out.println(c);
	}
	
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	 
	
	finally
	{
		System.out.println("finally block");
	}
	System.out.println("exception handled");
	}*/
	public static void main(String args[])
	{
		
	try
	{
		int a=5,b=0;
		int c=a/b;
		System.out.println(c);

		 String s="prak";
		
		System.out.println(s.toLowerCase());
	
	}
		

	catch(ArithmeticException e)
	{
		System.out.println("ae");
	}

	 catch(NullPointerException e)
	{
		
		 System.out.println("npe"); 
	}
	catch(Exception e)
	{
		
		 System.out.println("al exception"); 
	}
	
}
}

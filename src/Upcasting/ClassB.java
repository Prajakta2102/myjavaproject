package Upcasting;

public class ClassB extends ClassA//inheritance
{

	void add()
	{
		System.out.println("sub_class non static method");
	}
   
	static  void show()
	{
		System.out.println("Sub_class static method");
	}
	void adddata()
	{
		System.out.println("calling nonovveride method");
		
	}
	
		public static void main(String[]args)
		
		{
	
			/*	{
		for(int i=1;i<5;i++)
		{
		  for(int k=5;k>=i;k--)
		  {
		  System.out.printf(" ");
		  }
		   for(int j=1;j<=i;j++)
		  {
		  System.out.printf("* ");
		  }
		System.out.println();
		}

		for(int i=1;i<=5;i++)
		{
		  for(int k=1;k<=i;k++)
		  {
		  System.out.printf(" ");
		  }
		   for(int j=5;j>=i;j--)
		  {
		  System.out.printf("* ");
		  }
		System.out.println();
		}*/
	
	
	/*int a[]={1,6,3,9};
	for(int i=a.length-1;i>=0;i--)
	{
		
	  System.out.print(a[i]);

	}*/
			int a[]={1,6,7,6,1,7,3,9};
			int  count=0;
			for(int  i=0;i<a.length-1;i++)
			{
			 for(int j=i+1;j<=a.length-1;j++)
			{
			   if(a[i]==a[j])
			{
				   System.out.println(a[i]);
			 count++;
			 
			}
				
			}
			 
			}
			 System.out.println(count);
	
	/*String s="abcde";
	for(int i=s.length()-1; i>=0;i--)
	{

	char r=s.charAt(i);
	System.out.print(r);
	}*/


		}
}




	



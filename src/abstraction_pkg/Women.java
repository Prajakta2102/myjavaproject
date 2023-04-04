package abstraction_pkg;
public  abstract class Women //abstract class
{
	 int a=89;
 abstract  void to_Manage();//abstract method(without implementation)
	
	Women()//constructor(not work/call bcz obj cannot make)
	{
	 System.out.println("constructor name");
	}
    static void getname()
	{
		System.out.println("static method name");
	}
	
	 public static void main(String[] args)
	{
		//cannot create a obj of abstract class.
		
		//Women w=new Women();
		//getname();
		// System.out.println(a);
		
		char ch='P';
		int a[]= {298,7000,880,9000};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}

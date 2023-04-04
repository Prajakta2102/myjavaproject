package package_1;
public class Constructor 
{
	static int b=100;
	
	int a;//nonstatic  variable(declared)
	public Constructor()//without parmeter//user defined
	{
	   a=100;//initialized
	}
	public Constructor(int x)//with parmeter//user defined
	{
		a=200;
		//a=x;
		System.out.println(a);
		
	}
	public Constructor(int x,int y)
	{//constructor overloading (different parameter)	
		a=x;
		b=y;
	}
	public Constructor(byte x)//with parmeter//user defined
	{
		//a=200;
		a=x;
		System.out.println(a);
		
	}
	static void show()//declared
	{
		System.out.println("static method");//body defination
	}
	
  public static void main(String[] args) 
{
	Constructor c=new Constructor();
	//System.out.println(c.a);
	new Constructor();//calling without parameter  Constructor
	System.out.println(c.a);
	System.out.println("____________________________________");
	
	Constructor s=new Constructor(80);
	Constructor p=new Constructor(80,90);//with para constructor
	System.out.println(s.a);
	//new Constructor(90);
	show();
	System.out.println(p.a);
	System.out.println(p.b);
	Constructor l=new Constructor(5);
	System.out.println(l.a);
	

}

}

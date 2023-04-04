package Upcasting;

public class ClassC extends ClassA 
{
	int a=400;
	static int b=10000;
	ClassC()
	{
		a=9;
		System.out.println(" constructor");
	}
	ClassC(int s)
	{
		this();
		//super();
		a=s;
		System.out.println("para constructor");
		
		
	}
	void add()
	{
		
		int a=87,b=98;
		System.out.println(a + " "+b);
		//System.out.println(this.a + " "+this.b);//(this)same name local and global samwe clas
		//System.out.println(super.a + " "+super.b);//(super)calling super class var if(global) var name are same in parent and child class
		System.out.println("sub_class non static method of ClassC");
	}
	void  showdata()
    {
		
		System.out.println("subclass nonovvride method");
		super.showdata();
		this.add();

    }
	public static void main(String[] args) 
	{
		ClassC b=new ClassC(900);
		b.add();
		b.showdata();
		

	}

}

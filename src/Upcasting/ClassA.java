package Upcasting;//inheritance must in upcasting as superclss acquire property of subclass

public class ClassA//superclass
{
	int a=90;
	static int b=100;
	ClassA()
	{
		a=100;
	}
	void add()
	{
		int a=4;
		int b=5;
		//this is used when global var and local var name are same in same class.
		//this is used with only global var for differentite ..if var name of global and local are same..
		System.out.println(a + " "+b);//local var 
		System.out.println(this.a + " "+this.b);//globa var.
		System.out.println("Superclass non static method");
	}
   
	 void shown()
	{
	
		System.out.println("Superclass static method");
	}
	static void show(int a)
	{
		System.out.println("Superclass static method");
	}
   void  showdata()
    {
		System.out.println("Superclass nonovvride method");

    }
    
	public static void main(String[] args) 
	{
		ClassA a=new ClassA();
		//a.add();
		a.shown();
		
	}

}

package Upcasting;

public class Main_execution 
{

	public static void main(String[] args) 
	{
		long d=978008880L;
		int f=(int)d;
		System.out.println(f);
       /*ClassA a=new ClassA();//obj of superclass
       
       a.add();
       a.show();
       
       System.out.println("---------------------------------------");
       
       ClassB b=new ClassB();//obj of subclass
       b.add();
       b.show();*/
       
       System.out.println("---------------------------------------");
     ClassA r=new ClassB();//casting obj(ref of superclass =obj of sub)(upcasting)
     ClassA r1=new ClassC();
     r1.add();
       //calling subclasses properies in superclass
      r.add();
       // r.show();//static method not hid of superclass method in casting it call.
      r.showdata();//(only parentclass methods can access in upcasting)
        
		//ClassA r=new ClassB();
		
       ClassB ref= (ClassB)new ClassA();//downcasting(like explicit casting)(giving error)
      ref.adddata();
		
		/*ClassA r =new ClassB();//1st upcast
		ClassB b=(ClassB)r;//then downcast(only childclass ,parent class methods can access in downcastingcasting)
		b.adddata();
		b.showdata();
		b.add();
		b.show();*/
        
	}

}

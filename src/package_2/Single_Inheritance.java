package package_2;
public class Single_Inheritance //superclass/paraent class/base class
{
	static int a=90;
	int emp_id;//nonstatic var
	public   void show()//method(nonstatic)
	{
		System.out.println("this is emp_id");
	}
	  public Single_Inheritance()//without para constructor
	 {
		 emp_id=14;
		 System.out.println("this is without para conatructor"+":"+emp_id); 
	 }
	  public static void main(String args[])
	  {
		 // Single_Inheritance d=new Single_Inheritance();//obj of class Single_Inheritance
		  //d.show();//
		  
	  }
}
  
//single level inheriatnce


class Class_A extends Single_Inheritance//subclasas/child class/extented/derived claass
{
	  String emp_name;//non-static variable
	  public static void main(String args[])
	  {
		   Class_A s=new Class_A();//class A obj
		 // Single_Inheritance d=new Single_Inheritance();
		   s.show();
		 s.emp_id=15;
		// System.out.println(a);//static var
		 System.out.println(s.emp_id=17);
		  System.out.println(s.emp_name="prajakta");
		 
	  }
	
}


	

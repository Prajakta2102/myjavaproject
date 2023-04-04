package package_1;
public class Class_B 
{
	
  public static void main(String[] args) 
{
	   //****calling variable ****//
	    
	    System.out.println(" *STATIC VARIABLE* access in class_B  ");
	    System.out.println(Class_A.A);//Accessible
		System.out.println(Class_A.B);//Accessible
	   //System.out.println(Class_A.C);//Not_Accessible(private)
		System.out.println(Class_A.D);//Accessible
		System.out.println("-------------------------------------");
		
		//****calling Static Method ****//
		
		System.out.println(" *STATIC METHOD* access in class_B ");
		Class_A .show_Pub();//Accessible
		Class_A .show_Def();//Accessible
		//Class_A .show_Pri();//Not_Accessible
		Class_A .show_Pro();//Accessible
		System.out.println("-------------------------------------");
		
		//Creating obj of Class_A to call NONSTATIC variables/Methods with ACCESS SPECIFIER//
 		Class_A s=new Class_A();
		
 		//****calling NONStatic variables****//
 		System.out.println(" *NONSTATIC VARIABLE* access in class_B ");
 		System.out.println(s.a);//Accessible
 		System.out.println(s.b);//Accessible
 		//System.out.println(s.c);//NOT Accessible(private)
 		System.out.println(s.d);//Accessible
 		System.out.println("-------------------------------------");
 		
 		//****calling NONStatic Method****//
 		System.out.println(" *NONSTATIC METHOD* access in class_B ");
 		s.show_Npub();//Accessible
 		s.show_Ndef();//Accessible
 		//s.show_Npri();//Not Accessible(private)
 		s.show_Npro();//Accessible
}

}

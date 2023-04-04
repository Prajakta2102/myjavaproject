package package_2;
import package_1.Class_A;
public class Class_D extends Class_A //"INHERITANCE"(rel with Class A)
{
	/*public void abc()
	{
		show_Npro();
		show_Npub();
		//show_Ndef();
		show_Pro();
	}*/
     public static void main(String[] args)
  {
    	//****calling static variable****//
    	System.out.println(" *STATIC VARIABLE* access in class_D  ");
	    System.out.println(Class_A.A);//Accessible
	    //System.out.println(Class_A.A=900);//you cn update value of static var also
		//System.out.println(Class_A.B);//Not_Accessible(default)
	    //System.out.println(Class_A.C);//Not_Accessible(private)
		System.out.println(Class_A.D);//Accessible(protected)//"INHERITANCE"
		System.out.println("-------------------------------------");
		
		//****calling Static Method ****//
		 System.out.println(" *STATIC METHOD* access in class_D ");
		// Class_A .show_Pub();//Accessible
		 show_Pub();
	     //Class_A .show_Def();//Not_Accessible
         //Class_A .show_Pri();//Not_Accessible
		 Class_A.show_Pro();//Accessible(protected)//"INHERITANCE"
		 System.out.println("-------------------------------------");
		 
		 //Creating obj of Class_D to call NONSTATIC variables/Methods with ACCESS SPECIFIER//
		 
		//Class_A s=new Class_A();//obj of class_A 
		 //protected  nonstatic method/variable  is not accessible with class_A obj
		 Class_D s=new Class_D();// create obj of class_D
		 Class_D r=new Class_D();//2 ref create obj	
		//****calling NONStatic variables****//
	 	System.out.println(" *NONSTATIC VARIABLE* access in class_D ");		 	
	 	System.out.println(s.a);//Accessible
		//System.out.println(s.b);//NOT Accessible(default)
	 	//System.out.println(s.c);//NOT Accessible(private)
	 	System.out.println(s.d);// Accessible(protected)
	 	System.out.println(r.d=90);//we update value on r copy 
	 	System.out.println(s.d);//70 we hv to update on s copy also otherwise print previous val
	 	System.out.println("-------------------------------------");
		 		
		 //****calling NONStatic Method****//
		System.out.println(" *NONSTATIC METHOD* access in class_D");
	 	s.show_Npub();//Accessible
	 	//s.show_Ndef();//Not Accessible(default)
		//s.show_Npri();//Not Accessible(private)
	 	s.show_Npro();// Accessible(protected)
        
  }

}

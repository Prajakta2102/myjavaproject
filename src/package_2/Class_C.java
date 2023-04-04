package package_2;

import package_1.Class_A;

public class Class_C 
{
   public static void main(String[] args) 
   {
	      //****calling Static variable****//
	    
	     System.out.println(" *STATIC VARIABLE* access in class_C  ");
		 System.out.println(Class_A.A);//Accessible
		//System.out.println(Class_A.B);//Not_Accessible(default)
	   //System.out.println(Class_A.C);//Not_Accessible(private)
	   //System.out.println(Class_A.D);//Not_Accessible(protected)
		 
			//****calling Static Method ****//
		 
		 System.out.println(" *STATIC METHOD* access in class_C ");
		 Class_A .show_Pub();//Accessible
	    //Class_A .show_Def();//Not_Accessible
    	//Class_A .show_Pri();//Not_Accessible
		//Class_A .show_Pro();//Not_Accessible
		 System.out.println("-------------------------------------");
			
	    //Creating obj of Class_A to call NONSTATIC variables/Methods with ACCESS SPECIFIER//
	 	Class_A s=new Class_A();
			
	 	//****calling NONStatic variables****//
	 	System.out.println(" * NONSTATIC VARIABLE* access in class_C ");
	 	System.out.println(s.a);//Accessible
		//System.out.println(s.b);//NOT Accessible(default)
	 	//System.out.println(s.c);//NOT Accessible(private)
	 	//System.out.println(s.d);//Not Accessible(protected)
	 	System.out.println("-------------------------------------");
	 		
	 	//****calling NONStatic Method****//
	 	System.out.println(" * NONSTATIC METHOD* access in class_C ");
	 	s.show_Npub();//Accessible
	 	//s.show_Ndef();//Not Accessible(default)
		//s.show_Npri();//Not Accessible(private)
	 	//s.show_Npro();//not Accessible(protected)

	}

}

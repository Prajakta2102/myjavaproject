package package_1;
public class Class_A 
{
	  //****Types of ACCESS SPECIFIER with STATIC variable****//
	
	public static int A=100;//scope-->(public)within same/throughout project
	static int B=300;//scope--> without keyword->(default)within same package
	private static int C=500;//scope-->(private)within same class
	protected static int D=700;//scope-->(proteced)within same package and follow "INHERITANCE". 

	//****Types of ACCESS SPECIFIER with NON-STATIC variable****//
	
	public int a=10;//scope-->(public)within same/throughout project
	int b=30;//scope--> without keyword->(default)within same package
	private int c=50;//scope-->(private)within same class
	protected int d=70;//scope-->(proteced)within same package and follow "INHERITANCE". 
	
	//**********one difference bet default and protected*********
	//1.scope of both specifier will be within same package but
	// in protected ,if there is relation of 1 class in that pacakge
	//with another class or multiple class in different package
	// named the feature "INHERITANCE" (parent and child class) then
	//use protected that time.
	//2.we use "extends" to show the relation of class in "INHERITANCE". 
	
	//****Types of ACCESS SPECIFIER with STATIC methods****/
	
	public static void show_Pub()//PUBLIC static method
	 {
			System.out.println("This is PUBLIC STATIC METHOD"); 
	 }
	  static void show_Def()//DEFAULT static method
	 {
			System.out.println("This is DEFAULT STATIC METHOD"); 
	 }
	 private static void show_Pri()//PRIVATE static method
	 {
			System.out.println("This is PRIVATE STATIC METHOD"); 
	 }
	 protected static void show_Pro()//PROTECTED static method
	 {
			System.out.println("This is PROTECTED STATIC METHOD"); 
	 }
	//****Types of ACCESS SPECIFIER with NON-STATIC Method****/
   
	 public  void show_Npub()//PUBLIC static method
	 {
			System.out.println("This is PUBLIC NONSTATIC METHOD"); 
	 }
	   void show_Ndef()//DEFAULT static method
	 {
			System.out.println("This is DEFAULT NONSTATIC METHOD"); 
	 }
	 private void show_Npri()//PRIVATE static method
	 {
			System.out.println("This is PRIVATE NONSTATIC METHOD"); 
	 }
	 protected void show_Npro()//PROTECTED static method
	 {
			System.out.println("This is PROTECTED NONSTATIC METHOD"); 
	 }
	public static void main(String[] args) 

	{
		//****calling variable****//
		System.out.println(" *FOUR STATIC VARIABLE* access in class_A  ");
 		System.out.println(A);//Accessible
 		System.out.println(B);//Accessible
 		System.out.println(C);//Accessible
 		System.out.println(D);//Accessible
 		System.out.println("-------------------------------------");
 		
 		//****calling Static Method****//
 		System.out.println(" *FOUR STATIC METHOD* access in class_A ");
 		show_Pub();//Accessible
 		show_Def();//Accessible
 		show_Pri();//Accessible
 		show_Pro();//Accessible
 		System.out.println("-----------------------------------");
 		
 		//Creating obj to call NONSTATIC variables/Methods with ACCESS SPECIFIER//
 		Class_A s=new Class_A();
		
 		//****calling NONStatic variables****//
 		System.out.println(" *FOUR NONSTATIC VARIABLE* access in classA ");
 		System.out.println(s.a);//Accessible
 		System.out.println(s.b);//Accessible
 		System.out.println(s.c);//Accessible
 		System.out.println(s.d);//Accessible
 		System.out.println("-------------------------------------");
 		
 		//****calling NONStatic Method****//
 		System.out.println(" *FOUR NONSTATIC METHOD* access in class_A ");
 		s.show_Npub();//Accessible
 		s.show_Ndef();//Accessible
 		s.show_Npri();//Accessible
 		s.show_Npro();//Accessible
 	
 		
	}

}

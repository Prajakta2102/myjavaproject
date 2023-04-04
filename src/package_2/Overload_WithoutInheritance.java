package package_2;
public class Overload_WithoutInheritance 
{

	public static void main(String[] args) 
{
		
		Overload_A a=new  Overload_A ();//obj 
		a.shownst(10,100);//calling 1st nonstatic method with 2 arg (ref of obj from other class)
		Overload_A.show(5,6);//calling 1st static method with 2 arg (ref of classname from other class)
		//Overload_WithoutInheritance.show(5,5);//not possible
		

}

}

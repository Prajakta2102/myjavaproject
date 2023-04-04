package package_2;
public class Override_SubB extends Override_SuperA
{
	 public void mul(int a,int b)//1st nonstatic method
	   {
		  int c=a*a*b*b;
		  System.out.println("sub class nonstatic method with 2 argument:"+c );
	   }
	 
	 public static void show(int a,int b)//1st static method
	   {
		  int c=a*b*a;
		  System.out.println("sub-class static method with 2 argument: "+ c );
	   }
	  
	 
	 public static void main(String[] args)
	{
		 
		 //*METTHOD OVERRIDING only with nonstatic method
		Override_SubB b=new Override_SubB();
		b.mul(2,7);
		/*Override_SuperA a= new Override_SuperA();
		a.mul(7,9);*/
		
		
		//*METTHOD HIDING only with static method
		show(2,3);
		Override_SuperA.show(2,3);

    }

}
/* METTHOD HIDING is dis-advantage of METTHOD OVERRIDING .
 * when methods are static then  method of super class will hide in subclass
 * and execute the method of subclass always in term of inheritance.
 * 
 *  it will not remember inherited the static method of superclass.
 *  bcz ,we are calling static method in main method with the classname always.(ref is classname)
 * 
 * 
 */

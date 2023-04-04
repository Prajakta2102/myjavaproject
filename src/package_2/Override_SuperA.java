package package_2;
public class Override_SuperA
{
	  //int a=80;
	  public void mul(int a,int b)//1st nonstatic method
	   {
		  int c=a*b;
		  System.out.println("superclass nonstatic method with 2 argument: "+ c );
	   }
	  
	   public static void show(int a,int b)//1st static method
	   {
		  int c=a*b;
		  System.out.println("superclass static method with 2 argument: "+ c );
	   }
	  
	  
	   
public static void main(String[] args) 
{
	/*Override_SuperA a= new Override_SuperA();
	a.mul(7,9);*/
	
}

}
/*METTHOD OVERRIDING
 * 1.(mul())  METHODS should be NONSTATIC. 
 
 2.in java memory ,declaration of nonstaic  method will store in heap area at obj creation. 
 but 2 body(def) will store in method area for same method.(managing the memory)
 while calling in main method ,it will identify on basis of body def(diff -implementation) n obj of class.
 
 3.method name and declararion  must be same .
 
 4.it is possible with the inheriatance only .(INHERITANCE  and MEMORY MANAGEMENT is d Advantage of METTHOD OVERRIDING) 

*/

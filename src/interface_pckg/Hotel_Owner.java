package interface_pckg;
public interface Hotel_Owner 
{
	
	//interface is not class,,it's like class.
	int money = 5000;//public,static,final(by default interface var)
   void cook();//public,abstract(by default)
      void serve();
	/* interface is contain 100% abstract method only.it does not contain static and nonstatic     
	 * method
	 * implementation(inheritace) provide in subclasses...
	 * one interface inherits to other interface by using "extends"
	 * one interface "implements" to other subclass(impliment class) */
	 public default void toClean()
	{
		 System.out.println("cleaning the utensils");
	}
	 public static void getUniform()
	 {
		 System.out.println("uniform for the chef n team");
	 }
	
	 
	 public static void main(String args[])
	 {
		 getUniform();//calling static method 
	 }
}

package interface_pckg;
public class Chef_subclass implements Hotel_Owner 
{
	public void cook()//nonstatic(bcz class if it is interface then it is not staic/nonstatic)
	{
		System.out.println("to cook for customers");
	}
	public void serve()//public bcz its class to mentioned bcz it's override from interface(by default public)
	{
		System.out.println("to serve to customers");
	}

	public  void toClean()
	{
		 System.out.println("cleaning the vegetables");
	}
	

	public static void main(String[] args) 
{
		Chef_subclass c=new Chef_subclass();
		c.cook();
		c.serve();//calling obj of subclass to nonstatic method
		c.toClean();
		Hotel_Owner.getUniform();//calling static method
		
		//di fferent ways to call var of interface but cannot update val(static,final,public)
		System.out.println(money);
		System.out.println(c.money);
		System.out.println(Hotel_Owner .money);
		System.out.println(  Chef_subclass.money);
		

}

}

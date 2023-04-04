package abstraction_pkg;

public class  Mother extends Women 
{
	int age;
	 Mother()
	 {
		super();//calling women constructor 
	 }
	 Mother(int age)
	 {
		 age=28;
		 System.out.println("age " +age);
	 }
	 void to_Manage()//implementation of abstract method in extended sub class(override)
	{
		System.out.println("to manage house work");//diff implementation
	}
	public static void main(String[] args) 
	{
		
		//Women m=new Mother(34);//
		
		 //we cn make ref(m) of superclass not obj..
		 // we can make obj of subclass with ref of superclass
		// m.to_Manage();//calling method with ref of superclass n obj of subclass
		 Mother M=new  Mother(89);//we want one ref (women)so we r not using this
		  M.to_Manage();
		  
	}

}

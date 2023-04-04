package interface_pckg;

public class Daughter implements Father,Mother 
{
     //multiple inheritance achieved through interface
	public void getSurname()//both parents class method
	{
		System.out.println("Sagane");
	}
	public void getHome()
	 {
		 System.out.println("Home Sweet Home"); 
	 }
	
	public static void main(String[] args) 
	{
		Daughter d=new Daughter();
		d.getHome();
		d.getSurname();

	}

}

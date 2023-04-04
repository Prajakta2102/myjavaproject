package multilevel_InheriInterface_pkg;

public class Developer implements Client_2
{
	@Override
  public void getLogin_Page()
  {
	  
	  System.out.println("LOGIN_PAGE");
	  System.out.println("Password ,user_id,textbox");  
	  System.out.println("________________________________");
  }
	@Override
  public void show_HomePage()
  {
	  System.out.println("HOME_PAGE");
	  System.out.println("Amazon logo");
	  System.out.println("________________________________");
  }
  public void get_AddToCart()
  {
	  System.out.println("ADD_TO_CART");
	  System.out.println("subtotal,quantity of item,buy button"); 
	  System.out.println("________________________________");
  }
	
  public static void main(String[] args) 
	{
	  Developer d = new Developer();
	  d.getLogin_Page();
	  d.show_HomePage();
	  d.get_AddToCart();

	}

}

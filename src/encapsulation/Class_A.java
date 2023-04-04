package encapsulation;
public class Class_A 
{
  private String link="https://meet.google.com/bwa-ycsc-vai";//nonstatic var shoul be private
 public int x=6000;
 //private 
 static float c =1.2f;
 
  public void display_link()//method should be public not protected,private,default
  {
	  System.out.println(link);
  }
  
  
  public int show_var()//encapsulation
  {
	  System.out.println(x);
	  return x;
  }
  
  public static float show_float()
  {
	  System.out.println(c);
	  return c;
  }
  
}

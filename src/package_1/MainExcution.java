package package_1;

public class MainExcution 
{
    
	public static void main(String[] args) 
	{
		Class_Y y=new Class_Y();//obj child y 
		Class_Z z=new Class_Z();//obj child z
		Class_D d=new Class_D();//obj child d
		y.show();
		z.show();
		d.show();
		y=null;
		System.gc();
		//y.finalize();
		y.show();
		

	}

}

package package_1;
public class Prime_No 
{
public static void main(String[] args)
{
	int a[]= {13,14,15,16,17,587,45,93,83};
	
	for(int i=0;i<a.length;i++ )//2-3-4-5
	{
		int count=0;
		for(int j=1;j<=a[i];j++)//no divided by 1 or itself 
		{
			if(a[i]%j==0)//1.2%1==0..t/
			{
				count++;//2-->1/no itself//2-3-5-7
				
			}
		}
		if(count==2)//
		{
			System.out.println(" prime "  + a[i]);
		}
		/*else
		{
			System.out.println("no is not prime");
		}*/
	
	
	}
		
}

}

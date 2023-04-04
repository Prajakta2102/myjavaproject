package string;

public class ReverseStr_AtPos
{

	public static void main(String[] args) 
	{
		String a="prajakta sagane";//spilt the word
		String b[]=a.split(" ");//it will print before the string (letter) metione in spilt(arg)
		System.out.print(b[0]+" ");
		System.out.print(b[1]+" ");
		for(int i=0;i<=b.length-1;i++)//traverse the string array
		{
		for(int j=b[i].length()-1;j>=0;j--)//reverse loop
		{
			String x=b[i];//stored the string new var
			x.charAt(j);//char by 
			System.out.print(x.charAt(j));
			
		}
		
		
		
	/*	String s="hello";//1st way
		
		for(int k=s.length()-1;k>=0;k--)
		{
			char m=s.charAt(k);
			System.out.println(m);
		}
		
		
		String y="prajakta";//2nd way
		String z="";
		for(int i=y.length()-1;i>=0;i--)
		{
			z=z+y.charAt(i);
			
		}
		System.out.println(z);
		
	}*/

}
	}
}


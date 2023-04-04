package abstraction_pkg;

public class Employee extends Women
{
	Employee()//constructor
	{
		super();//superclass constructor calling using super keyword
	}
	 void to_Manage()//implementation of abstract method in extended sub class
		{
			System.out.println("to manage office work");//diff implementation
		}

	public static void main(String[] args) 
	{
		
		Women p=new Employee();
		 //we cn make ref(p) of superclass not obj..
		 // we can make obj of subclass with ref of superclass
		 p.to_Manage();//calling method with ref of superclass n obj of subclass
		 /*Employee e=new Employee ();//we want one ref (women)so we r not using this
		  e.to_Manage();*/
		 
		 
		/* int a[]= {1,3,7,7,8,3,1,9,6};//0,1,2,3,4,5,....8
		 int count=0;
		 for(int i=0;i<=a.length-1;i++)//traverse//i=0,1
		 {
			 for(int j=i+1;j<=a.length-1;j++)//compare//j=2,3,4
			 {
				if(a[i]==a[j])//1==3//f//1==1
				{
					System.out.println(a[j]);
					count++;//1
				}
			 }
		 }
		System.out.println(count+" "+a.length);
	}*/
		
		 int a[]= {2,3,48,59,1};
		 int max,i;
		 for( i=0;i<=a.length-1;i++)
		 {
			 for(int j=i+1;j<=a.length-1;j++)
			 {
				 if(a[i]>a[j])//
				 {
					 max=a[i];
					 a[i]=a[j];
					 a[j]=max;
					 
				 }
			 }
			
		 }
		 System.out.println(a[i-2]);
	}
}

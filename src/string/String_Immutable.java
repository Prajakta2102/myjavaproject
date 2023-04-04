package string;
public class String_Immutable 
{

	public static void main(String[] args) 
	{
		
		String a=" Prajakta Sagane";//create  string by using 1st way string literal(without new)
		String b="Prajakta kalmegh";//same memory loction a,b indicate same value.
		//a and b are address var stored value "Prajakta" at same location.
        System.out.println(a);
        System.out.println(b);
        System.out.println(  a.equals(b));//value compare (upper n lower case must be same)
        System.out.println(  a==b);//compare memory loc(address var)
        System.out.println("_________________________________________");
        b= "Arjun";//took another memory loc to store value
        System.out.println(b);
        a.equals(b);
        System.out.println(  a.equals(b));
        System.out.println(  a==b);
        System.out.println("_________________________________________");
        String c=new String("Prajakta");//create  string by using 2nd way using new keyword
        String d=new String("Prajakta");
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(  c.equals(d));
        System.out.println(  c==d);
        System.out.println("_________________________________________");
        c="sonu";

        System.out.println(c);
        System.out.println(d);
        System.out.println(  c.equals(d));
        System.out.println(  c==d);
        
       boolean E=a.equalsIgnoreCase(b);
       System.out.println( E);
       
       int F=b.length();
       System.out.println( F);
       
       char G=b.charAt(4);
       System.out.println( G);
       
       
       int H=a.indexOf('j');//if the letter is repeated return 1st letter index
       //if the char not present return -1
       System.out.println( H);
       
     
       String I=a.toUpperCase();
       System.out.println(  I);
       
       String J=a.toLowerCase();
       System.out.println( J);
       
       boolean K=b.endsWith("n");//return type boolean//check suffix last letter of string
       System.out.println(K);
       
       String L=a.substring(4);//starting val:-starting from that index string return
       System.out.println( L);
       
       String M=a.substring(4,8);//starting ind,end index
       //we have to add +1 in end index then it gives r8 input.
       System.out.println(M);
       
       String N=a.replace('a','u');//old char,new char
       System.out.println(N);
       
      int O=a.lastIndexOf('k');
       System.out.println( O);
       
       String P[]=a.split("r");//skip this char ,,split str in array
       System.out.println(P[0]);
       System.out.println(P[1]);
       
       String Q=a.trim();
       System.out.println(Q);
       
       String m=" Abhishek Sagane ";
       String q=m.trim();
       System.out.println(q+a.trim());//not print space..ignore the space
       
       String s="allperfect";
       String x=s.substring(3,10);
       
       System.out.print(x);
       
       
       
       
       
       
        
        
	}

}

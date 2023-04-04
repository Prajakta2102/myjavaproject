package collection;
import java.util.*;
public class Set_Hash {

	public static void main(String[] args) 
	{
		//Set interface-->iterable (supermost interface)
      HashSet hs=new HashSet();////-->implimentation class of Set(I)
      hs.add(111);
      hs.add("prajakta sagane");
      hs.add("infosys");
      hs.add("QA");
      hs.add("QA");
      hs.add(null);//only one null values are allow in set
      hs.add(null);
      System.out.println(hs);
      System.out.println(hs.hashCode());
	}

}

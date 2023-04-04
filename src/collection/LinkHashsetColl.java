package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkHashsetColl {

	public static void main(String[] args) 
	{
		LinkedHashSet linkedHs=new LinkedHashSet();
		linkedHs.add(111);//to add data in collection
		linkedHs.add("prajkata sagane");
		linkedHs.add("QA");
		linkedHs.add("tcs");
		linkedHs.add("banglore");
		linkedHs.add("9945757357");
		linkedHs.add(null);//multiple null values are allow in arraylist
		linkedHs.add(null);
		System.out.println(linkedHs);
		
		
		//
		HashSet hs=new HashSet();
		hs.add("prajakta");
		hs.add("abhishek");
		hs.add("arjun");
		System.out.println(hs);
		
		TreeSet ts=new TreeSet();//it will take either all int data or string data cannot take both at time
		ts.add(33);
		ts.add(560);
		ts.add(89);
		//ts.add("prajakta");//not allow String data.//
		System.out.println(ts);
		
		ArrayList al=new ArrayList();
		al.addAll(ts);
		System.out.println(al.get(2));
	}

}

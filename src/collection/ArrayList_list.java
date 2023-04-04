package collection;
import java.util.*
;
public class ArrayList_list 
{

	public static void main(String[] args)
	{
		//List interface-->iterable (supermost interface)
		ArrayList l=new ArrayList();//-->implimentation class of list(I)
		l.add(111);//to add data in collection
		l.add("prajkata sagane");
		l.add("QA");
		l.add("tcs");
		l.add("banglore");
		l.add("9945757357");
		l.add(null);//multiple null values are allow in arraylist
		l.add(null);
		//l.remove(5);//to remove particular data
		//System.out.println(l);
		//System.out.println(l.get(4));//get data at index
		//Traversing list through Iterator
	/*	ArrayList<String> list=new ArrayList<String>();
        Iterator<String>itr=list.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
		*/
		
	
		//Set interface-->iterable (supermost interface)
    HashSet hs=new HashSet();////-->implimentation class of Set(I)
	      hs.add(111);
	      hs.add("prajakta sagane");
	      hs.add("infosys");
	      hs.add("QA");
	      hs.add(null);//only one null values are allow in set
	      hs.add(null);
	    //  System.out.println(hs);
			 
	      HashSet h1=new HashSet(l);//adding 1 collection into another
	     // ArrayList l=new ArrayList();
	     // h1.addAll(l);
	      System.out.println(h1);
	
	
	
	  	ArrayList l1=new ArrayList(hs);
	
	  	System.out.println(l1);
	
	}
	
	
	

}
/*The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects.
 Java Collection framework provides many interfaces (Set, List, Queue, Deque) and
  classes (ArrayList_list, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
 *
 * The Iterable interface is the root interface for all the collection classes.
 * The Collection interface is the interface which is implemented by all the classes in the collection framework. 
 * 
 * List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList_list, LinkedList, Vector, and Stack.
Java ArrayList_list class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

The ArrayList_list in Java can have the duplicate elements also. It implements the List interface so we can use all the methods of the List interface here. The ArrayList_list maintains the insertion order internally.
ava ArrayList_list class can contain duplicate elements.
Java ArrayList_list class maintains insertion order.
Java ArrayList_list class is non synchronized.
Java ArrayList_list allows random access because the array works on an index basis.
In ArrayList_list, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.*/

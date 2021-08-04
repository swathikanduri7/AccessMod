package setexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);

	      //Displaying HashSet elements
	      System.out.println(hset);
	      
	      Iterator<String> it = hset.iterator();
	      while(it.hasNext()){
	         System.out.println(it.next());
	      }
	      //Iterate without using Iterator
	      for (String temp : hset) {
	          System.out.println(temp);
	       }
	      try{
	    	  for (String temp : hset) {
	    		  hset.add("concurrent test");
		          System.out.println(temp);
		       } 
	      }catch(Exception e){
	    	  System.out.println("Exception"+ e);
	      }
	      
	      
	      // Creating a List of HashSet elements
	      List<String> list = new ArrayList<String>(hset);
	  
	      // Displaying ArrayList elements
	      System.out.println("ArrayList contains: "+ list);
	      
	   // Creating a TreeSet of HashSet elements
	      try{
	    	  Set<String> tset = new TreeSet<String>(hset);
	    	  // Displaying TreeSet elements
		      System.out.println("TreeSet contains: ");
		      for(String temp : tset){
		         System.out.println(temp);
		      }
	      }catch(Exception e){
	    	  System.out.println("Exception"+ e);
	      }
	      
	  
	     
	    }
}
/*
HashSet Methods:
boolean add(Element  e): It adds the element e to the list.
void clear(): It removes all the elements from the list.
Object clone(): This method returns a shallow copy of the HashSet.
boolean contains(Object o): It checks whether the specified Object o is present in the list or not. If the object has been found it returns true else false.
boolean isEmpty(): Returns true if there is no element present in the Set.
int size(): It gives the number of elements of a Set.
boolean(Object o): It removes the specified Object o from the Set.
*/
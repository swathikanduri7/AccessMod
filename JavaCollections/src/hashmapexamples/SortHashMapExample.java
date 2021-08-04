package hashmapexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      
	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	      System.out.println("\n");
	      //Using Tree Map
	      
	      
	      System.out.println("Sorted Values through Tree Map");
	      TreeMap<Integer, String> sorted = new TreeMap<>(hmap);
	      
	      /* Display content using Iterator*/
	      set = sorted.entrySet();
	      iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	      
	      //Using ArrayList
	      hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      
	      List<Integer> keysSet = new ArrayList<>(hmap.keySet());
	      Collections.sort(keysSet);
	      
	      System.out.println("Sorted Values through keys set using Collections.sort :: ");
	      for(int key:keysSet){
	    	  System.out.println("key is : "+ key +" && value is :"+hmap.get(key) );
	      }
	      
	      List<String> valueset = new ArrayList<>(hmap.values());
	      Collections.sort(valueset);
	      
	      System.out.println("Sorted Values through keys set using Collections.sort :: ");
	      for(String value:valueset){
	    	  System.out.println(" value is :" +value );
	      }
	     

	}

}

package hashmapexamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String args[]) {

	      /* This is how to declare TreeMap */
	      TreeMap<Integer, String> tmap = 
	             new TreeMap<Integer, String>();

	      /*Adding elements to TreeMap*/
	      tmap.put(1, "Data1");
	      tmap.put(23, "Data2");
	      tmap.put(70, "Data3");
	      tmap.put(4, "Data4");
	      tmap.put(2, "Data5");

	      /* Display content using Iterator*/
	      Set set = tmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	      
	   // Removing element which is mapped to Key is 4
	      /* public V remove(Object key): Removes the mapping 
	       * for this key from this TreeMap if present.
	       */
	      Object removedElement = tmap.remove(4);
	      System.out.println("Removed Element: "+removedElement);
	   
	      // TreeMap Elements after remove
	      System.out.println("After: TreeMap contains: "+tmap);
	      
	      set = tmap.keySet();
	      iterator = set.iterator();
	      while(iterator.hasNext()) {
	         System.out.print("\n key is: "+ iterator.next());	        
	      }
	      
	      
	     
	      iterator = tmap.values().iterator();
	      while(iterator.hasNext()) {
	         System.out.print("\n value is: "+ iterator.next());	        
	      }
	}
}

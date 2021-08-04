package hashmapexamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String args[]) {

	      /* This is how to declare HashMap */
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

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }
	      
	   // Checking Key Existence
	      boolean flag = hmap.containsKey(49);
	      System.out.println("Key 22 exists in HashMap? : " + flag);
	   
	      boolean flag2 = hmap.containsKey(55);
	      System.out.println("Key 55 exists in HashMap? : " + flag2);
/*
 Serialization of HashMap:
  In the below class we are storing the HashMap
   content in a hashmap.ser serialized file. 
 */
	      try
          {
                 FileOutputStream fos =
                    new FileOutputStream("hashmap.ser");
                 ObjectOutputStream oos = new ObjectOutputStream(fos);
                 oos.writeObject(hmap);
                 oos.close();
                 fos.close();
                 System.out.printf("Serialized HashMap data is saved in hashmap.ser");
          }catch(IOException ioe)
           {
                 ioe.printStackTrace();
           }
	    
	      /*
	 	 
	 	 De-Serialization:
	 	  Here we are reproducing the HashMap object
	 	   and it’s content from a serialized file
	 	    which we have created by running the above code.
	 	 */
	      HashMap<Integer, String> map = null;
	      try
	      {
	         FileInputStream fis = new FileInputStream("hashmap.ser");
	         ObjectInputStream ois = new ObjectInputStream(fis);
	         map = (HashMap) ois.readObject();
	         ois.close();
	         fis.close();
	      }catch(IOException ioe)
	      {
	         ioe.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Class not found");
	         c.printStackTrace();
	         return;
	      }
	      System.out.println("\nDeserialized HashMap..");
	      // Display content using Iterator
	       set = map.entrySet();
	       iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key: "+ mentry.getKey() + " & Value: ");
	         System.out.println(mentry.getValue());
	      }
	   }
	
	
	
	
}


/*
 * 
HashMap Class Methods
Here is the list of methods available in HashMap class. I have also covered examples using these methods at the end of this post.

void clear(): 
It removes all the key and value pairs from the specified Map.

Object clone():
 It returns a copy of all the mappings of a map and used for cloning them into another map.

boolean containsKey(Object key):
 It is a boolean function which returns true or false based on whether the specified key is found in the map.

boolean containsValue(Object Value): 
Similar to containsKey() method, however it looks for the specified value instead of key.

Value get(Object key):
 It returns the value for the specified key.

boolean isEmpty():
 It checks whether the map is empty. If there are no key-value mapping present in the map then this function returns true else false.

Set keySet(): 
It returns the Set of the keys fetched from the map.

value put(Key k, Value v):
 Inserts key value mapping into the map. Used in the above example.

int size():
 Returns the size of the map – Number of key-value mappings.

Collection values():
 It returns a collection of values of map.

Value remove(Object key):
 It removes the key-value pair for the specified key. Used in the above example.

void putAll(Map m):
 Copies all the elements of a map to the another specified map.

*/

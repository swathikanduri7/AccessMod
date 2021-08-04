package listexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String args[]){  
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	  
	      //displaying elements
	      System.out.println(alist); //[Steve, Tim, Lucy, Pat, Angela, Tom]
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "Steve");
	  
	      //displaying elements
	      System.out.println(alist);//[Steve, Tim, Lucy, Steve, Pat, Angela, Tom]
	   
	     //Change an element in ArrayList
	      alist.add(0, "ChangedValue");
	      
	      //displaying elements
	      System.out.println(alist);//[ChangedValue, Steve, Tim, Lucy, Steve, Pat, Angela, Tom]
	   
	      //remove elements from ArrayList
	    //Removing "Steve" and "Angela"
	      alist.remove("Steve");
	      alist.remove("Angela");
	      
	    //displaying elements
	      System.out.println(alist);//[ChangedValue, Tim, Lucy, Steve, Pat, Tom]
	   
	      //iterating ArrayList
	      for(String str:alist)  
	         System.out.println(str);  
	      
	    //ArrayList Size
	  	System.out.println("Number of elements in ArrayList: " +alist.size());
	     
	//Sort ArrayList
	  	Collections.sort(alist);
	  	
	  //displaying elements
	      System.out.println(alist); //[ChangedValue, Lucy, Pat, Steve, Tim, Tom]

	  	
	      //combine two ArrayLists
	      //First ArrayList
	        ArrayList<String> arraylist1=new ArrayList<String>();
	        arraylist1.add("AL1: E1");
	        arraylist1.add("AL1: E2");
	        arraylist1.add("AL1: E3");

	        //Second ArrayList
	        ArrayList<String> arraylist2=new ArrayList<String>();
	        arraylist2.add("AL2: E1");
	        arraylist2.add("AL2: E2");
	        arraylist2.add("AL2: E3");

	        //New ArrayList
	        ArrayList<String> al= new ArrayList<String>();
	        al.addAll(arraylist1);
	        al.addAll(arraylist2);

	        //Displaying elements of the joined ArrayList
	        for(String temp: al){
	            System.out.println(temp);
	        }
	        al.trimToSize();
	        System.out.println(al);
	        
	        // ArrayList Cloning
	        ArrayList<String> al2 = (ArrayList<String>)al.clone();
	        System.out.println("Shallow copy of ArrayList: "+ al2);
	        
	        
	        // ArrayList with Capacity 4
	        al = new ArrayList<String>(4);
	        //Added 4 elements
	        al.add("Hi");
	        al.add("Hello");
	        al.add("Bye");
	        al.add("GM");

	        //Increase capacity to 5
	        al.ensureCapacity(5);

	        al.add("GE");
	        // let us print all the elements available in list
	        for (String temp: al) {
	              System.out.println(temp);
	        }
	        
	        //How to make ArrayList synchronized
	      //Use Collecions.synzhonizedList method
	        java.util.List list = Collections.synchronizedList(al);
	      //If you wanna use iterator on the synchronized list, use it
	      //like this. It should be in synchronized block.
	      synchronized (al) {
	        Iterator iterator = al.iterator();
	        while (iterator.hasNext()){
	        	System.out.println(iterator.next());
	        }
	      }
	}  
	
}

/*Methods of ArrayList class
In the above example we have used methods such as add() and remove(). However there are number of methods available which can be used directly using object of ArrayList class. Let’s discuss few important methods of ArrayList class.

1) add( Object o): This method adds an object o to the arraylist.

obj.add("hello");
This statement would add a string hello in the arraylist at last position.

2) add(int index, Object o): It adds the object o to the array list at the given index.

obj.add(2, "bye");
It will add the string bye to the 2nd index (3rd position as the array list starts with index 0) of array list.

3) remove(Object o): Removes the object o from the ArrayList.

obj.remove("Chaitanya");
This statement will remove the string “Chaitanya” from the ArrayList.

4) remove(int index): Removes element from a given index.

obj.remove(3);
It would remove the element of index 3 (4th element of the list – List starts with o).

5) set(int index, Object o): Used for updating an element. It replaces the element present at the specified index with the object o.

obj.set(2, "Tom");
It would replace the 3rd element (index =2 is 3rd element) with the value Tom.

6) int indexOf(Object o): Gives the index of the object o. If the element is not found in the list then this method returns the value -1.

int pos = obj.indexOf("Tom");
This would give the index (position) of the string Tom in the list.

7) Object get(int index): It returns the object of list which is present at the specified index.

String str= obj.get(2);
Function get would return the string stored at 3rd position (index 2) and would be assigned to the string “str”. We have stored the returned value in string variable because in our example we have defined the ArrayList is of String type. If you are having integer array list then the returned value should be stored in an integer variable.

8) int size(): It gives the size of the ArrayList – Number of elements of the list.

int numberofitems = obj.size();
9) boolean contains(Object o): It checks whether the given object o is present in the array list if its there then it returns true else it returns false.

obj.contains("Steve");
It would return true if the string “Steve” is present in the list else we would get false.

10) clear(): It is used for removing all the elements of the array list in one go. The below code will remove all the elements of ArrayList whose object is obj.

obj.clear();

trimToSize() method is used for memory optimization.
 It trims the capacity of ArrayList to the current list size.
  For e.g. An arraylist is having capacity of 15 
  but there are only 5 elements in it, calling trimToSize()
   method on this 
   ArrayList would change the capacity from 15 to 5.

public void trimToSize()

ArrayList internally implements growable dynamic array which means it can increase and decrease its size automatically. If we try to add an element to a already full ArrayList then it automatically re-sized internally to accommodate the new element however sometimes its not a good approach.

Consider a scenario when there is a need to add huge number of elements to an already full ArrayList, in such case ArrayList has to be resized several number of times which would result in a poor performance. For such scenarios ensureCapacity() method of Java.util.ArrayList class is very useful as it increases the size of the ArrayList by a specified capacity.

public void ensureCapacity(int minCapacity)

*/

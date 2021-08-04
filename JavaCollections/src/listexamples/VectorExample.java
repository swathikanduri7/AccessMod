package listexamples;

import java.util.*;

public class VectorExample {

   public static void main(String args[]) {
      /* Vector of initial capacity(size) of 2 */
      Vector<String> vec = new Vector<String>(2);

      /* Adding elements to a vector*/
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Fig");

      /* check size and capacityIncrement*/
      System.out.println("Size is: "+vec.size());
      System.out.println("Default capacity increment is: "+vec.capacity());

      vec.addElement("fruit1");
      vec.addElement("fruit2");
      vec.addElement("fruit3");

      /*size and capacityIncrement after two insertions*/
      System.out.println("Size after addition: "+vec.size());
      System.out.println("Capacity after increment is: "+vec.capacity());

      /*Display Vector elements*/
      Enumeration en = vec.elements();
      System.out.println("\nElements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + " ");
   }
}

/*
methods of Vector Class:

void addElement(Object element): 
It inserts the element at the end of the Vector.

int capacity():
 This method returns the current capacity of the vector.

int size(): 
It returns the current size of the vector.

void setSize(int size): 
It changes the existing size with the specified size.

boolean contains(Object element): 
This method checks whether the specified element is present in the Vector. If the element is been found it returns true else false.

boolean containsAll(Collection c):
 It returns true if all the elements of collection c are present in the Vector.

Object elementAt(int index):
 It returns the element present at the specified location in Vector.

Object firstElement():
 It is used for getting the first element of the vector.

Object lastElement():
 Returns the last element of the array.

Object get(int index):
 Returns the element at the specified index.

boolean isEmpty():
 This method returns true if Vector doesn’t have any element.

boolean removeElement(Object element):
 Removes the specifed element from vector.

boolean removeAll(Collection c):
 It Removes all those elements from vector which are present in the Collection c.

void setElementAt(Object element, int index):
 It updates the element of specifed index with the given element.*/
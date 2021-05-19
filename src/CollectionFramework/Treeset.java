package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String args[]){  
		 TreeSet<String> set=new TreeSet<String>();  
		         set.add("Ayush");  
		         set.add("Raju");  
		         set.add("Adi");  
		         System.out.println("print elements in descending order");  
		         Iterator itr=set.descendingIterator();  
		         while(itr.hasNext())  
		         {  
		             System.out.println(itr.next());  
		         }  
		           
		 }  
}

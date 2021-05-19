package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("dddd");  
		al.add("ssss");  
		al.set(0, "ASAS");
		
		for(String d:al)
		{
			System.out.println(d);
		}
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
}

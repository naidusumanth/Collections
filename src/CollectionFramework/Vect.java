package CollectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class Vect {
	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("raju");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		for(String s:v)
		{
			System.out.println(s);
		}
		}  
}

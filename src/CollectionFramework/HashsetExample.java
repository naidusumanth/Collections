package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {
	public static void main(String args[]){   
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Ayush");    
		  set.add("raju");  
		  set.add("Ayush");  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
}
}
}

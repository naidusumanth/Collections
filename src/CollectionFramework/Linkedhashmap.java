package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Linkedhashmap {
	public static void main(String args[]){  
		   
		  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(10,"Ayush");  
		  hm.put(1044,"raju");  
		  System.out.println("keys"+hm.keySet());
		  
		  System.out.println("values"+hm.values());
		  
		for(Entry<Integer, String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }
}

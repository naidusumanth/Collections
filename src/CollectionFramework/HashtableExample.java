package CollectionFramework;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableExample {
	public static void main(String args[]) {  
		  Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
		     map.put(1,"Ayush");    
		     map.put(12,"Raju");   
		     map.put(3,"Adi");      
		     System.out.println("Before remove: "+ map);    
		       map.remove(1);  
		       System.out.println("After remove: "+ map);  
		       for(Entry<Integer, String> m:map.entrySet()){  
		    	   System.out.println(m.getKey()+" "+m.getValue());  
		    	  }  
		    	 }  
}

package CollectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String args[]){  
		   HashMap<Integer,String> map=new HashMap<Integer,String>();
		   map.put(1,"Maran");   
		   map.put(2,"Arith");    
		            
		   System.out.println("Iterate");  
		   for(Entry<Integer, String> d : map.entrySet()){    
		    System.out.println(d.getKey()+" "+d.getValue());    
		   }  
		}  
}

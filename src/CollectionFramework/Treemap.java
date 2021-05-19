package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	public static void main(String args[]){  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(1111,"Ayush");    
		      map.put(1222,"Raju");    
		          
		        
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
		 }  
}

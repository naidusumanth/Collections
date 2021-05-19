package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {
	public static void main(String args[]){  
        LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("Ayush");    
               set.add("Raju");    
               set.add("Adi");   

               Iterator<String> itr=set.iterator();  
               while(itr.hasNext())  
               {  
               System.out.println(itr.next());  
               }
               for(String s:set)
               {
            	   System.out.println(s);
               }
 }  
}

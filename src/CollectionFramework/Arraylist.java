package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {


	public static void main(String []args)
	{
		ArrayList<String>al=new ArrayList();
		al.add("surya");
		al.add("v");
		al.add("ddd");
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



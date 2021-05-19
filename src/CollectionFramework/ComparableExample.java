package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Data implements Comparable<Data>{  
	int rollno;  
	String name;  
	int age;  
	Data(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	public int compareTo(Data st){  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
	}  
	}  
	public class ComparableExample{  
	public static void main(String args[]){  
	ArrayList<Data> al=new ArrayList<Data>();  
	al.add(new Data(22,"Ayush",25));  
	al.add(new Data(14,"Raju",22));  
	al.add(new Data(19,"adi",20));  
	  
	Collections.sort(al);  
	for(Data st:al){  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	}  

}

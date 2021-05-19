package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	}  
class AgeComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}
class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
}  
public class Comparat{
	public static void main(String args[]){   
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(1,"Ayush",19));  
		al.add(new Student(122,"Raju",21));  
		al.add(new Student(166,"adi",17));  
		  
		System.out.println("Sorting Name");   
		Collections.sort(al,new NameComparator());  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sort Age");    
		Collections.sort(al,new AgeComparator());  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		}  
}

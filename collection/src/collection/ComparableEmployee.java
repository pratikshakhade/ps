package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEmployee implements Comparable<ComparableEmployee>{
     
	String name;
	int age;
	int sallary ;
	
	public ComparableEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public ComparableEmployee(String name,int age,int sallary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.sallary=sallary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee = { name:"+name+", age :"+age+", sallary:"+sallary+"}";
	}
	
	@Override
	public  int compareTo(ComparableEmployee o) {
		// TODO Auto-generated method stub
	return	name.compareTo(o.name);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ComparableEmployee> emp = new ArrayList<ComparableEmployee>();
		
		emp.add( new ComparableEmployee("pritam",26,9));
		emp.add( new ComparableEmployee("pratiksha",23,20));
		emp.add( new ComparableEmployee("ashu",27,16));
		
		
		Collections.sort(emp);
		System.out.println(emp);
		
	}




}

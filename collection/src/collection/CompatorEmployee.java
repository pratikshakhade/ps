package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompatorEmployee {

	 String name;
	 int age;
	int sallary;
	public CompatorEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public CompatorEmployee(String name,int age,int sallary) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method tub
		
		List<CompatorEmployee> emp = new ArrayList<CompatorEmployee>();
		
		emp.add( new CompatorEmployee("pritam",26,98));
		emp.add( new  CompatorEmployee("pratiksha",23,20));
		emp.add( new  CompatorEmployee("ashu",27,16));
  Collections.sort(emp, new compatorC() );
  System.out.println(emp);
		
	}



}

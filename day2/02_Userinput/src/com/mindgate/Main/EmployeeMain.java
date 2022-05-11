package com.mindgate.Main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner st= new Scanner(System.in);
		System.out.println("enter the employeeId :");
		int employeeId=st.nextInt();
		
		System.out.println("enter the name :");
		String name=st.next();
		
		System.out.println("enter the salary :");
		double salary=st.nextDouble();
		

		Employee emp= new Employee();
		emp.setEmployeeId(employeeId);
		emp.setName(name);
		emp.setSalary(salary);
		System.out.println(emp.getEmployeeId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		System.out.println("-".repeat(50));
		
		Employee emp2=new Employee(employeeId,name, salary);
		System.out.println(emp2.getEmployeeId());
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());

	}
	
}

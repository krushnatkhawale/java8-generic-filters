package com.java.functional.filter.util;

import java.util.Arrays;
import java.util.List;

import com.java.functional.filter.model.Employee;

public class ListUtils {
	public static List<Employee> getEmployees(){
		return Arrays.asList( 
				new Employee(1, "Dashrath", "Manager", 38),
				new Employee(2, "Sitaram", "Sr-Manager", 39),
				new Employee(3, "Dhanush", "Manager", 34),
				new Employee(4, "Dharamendra", "Sr-Manager", 43),
				new Employee(5, "Kartik", "Developer", 25),
				new Employee(6, "Karna", "Developer", 25),
				new Employee(7, "Wosimosi", "Coder", 25),
				new Employee(8, "Wilson", "VP", 58),
				new Employee(9, "Warner", "VP", 58),
				new Employee(10, "Brad", "VP", 38)
				);
	}
}

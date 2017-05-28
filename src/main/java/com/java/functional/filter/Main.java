package com.java.functional.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.functional.filter.model.Employee;
import com.java.functional.filter.util.ListUtils;
import static com.java.functional.filter.FilterUtils.getFilteredStream;

public class Main {
	public static void main(String[] args) {
		System.out.println("Test");
		
		List<Employee> employees = ListUtils.getEmployees();

		Stream<Employee> stream1 = getFilteredStream(employees.stream(), filterSet1());		
		System.out.println("Filters1: " + stream1.collect(Collectors.toList()));

		Stream<Employee> stream2 =  getFilteredStream(employees.stream(), filterSet2());
		System.out.println("Filters2: " + stream2.collect(Collectors.toList()));

	}

	private static List<Predicate<Employee>> filterSet1(){
		return Arrays.asList(
				(Employee e) -> e.getAge() < 40,
				(Employee e) -> e.getDesignation().equals("VP")
		);
	}
	private static List<Predicate<Employee>> filterSet2(){
		return Arrays.asList(
				(Employee e) -> e.getAge() <40,
				(Employee e) -> e.getDesignation().equals("Developer")
		);
	}
}
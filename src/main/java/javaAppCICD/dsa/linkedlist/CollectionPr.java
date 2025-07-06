package javaAppCICD.dsa.linkedlist;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class CollectionPr {

	public static int sumOfDigit(int n ) {
		int sum =0;
		while(n>0) {
			sum = sum + n % 10;
		n= n/10;	
		}
		return sum;
	}
	
	public static void main(String args[]) {
//		List<Employee> employees = List.of(
//	            new Employee("John Smith", "Engineering", 85000, 32),
//	            new Employee("Jane Doe", "Marketing", 70000, 28),
//	            new Employee("Mike Johnson", "Engineering", 90000, 35),
//	            new Employee("Sarah Williams", "Engineering", 82000, 29),
//	            new Employee("Robert Brown", "Engineering", 95000, 40)
//	        );
		
		int test = 55;
		int ans = sumOfDigit(test);
		System.out.println(ans);
		
//		List<Object> filterName = employees.stream().filter(employees->employees.getDepartment().equals("Engineering"))
//				.filter(employees->employees.getAge()>30).sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
		
	}
	

}

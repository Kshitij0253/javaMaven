package javaAppCICD.dsa.linkedlist;

public class Employee {

	 private String name;
	    private String department;
	    private double salary;
	    private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Employee(String name, String department, double salary, int age) {
			super();
			this.name = name;
			this.department = department;
			this.salary = salary;
			this.age = age;
		}
	    
	    
}

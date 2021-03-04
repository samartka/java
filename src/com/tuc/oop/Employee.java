package com.tuc.oop;

public class Employee {
	public String firstname;
	public String lastname;
	public String position;
	private int salary;
	public static String breath = "Oxygen";

	public Employee(String firstnameInput, String lastnameInput,String positionInput, int salaryInput) {
		firstname = firstnameInput;
		lastname = lastnameInput;
		position = positionInput;
		salary = salaryInput;
	}
	public static void main(String[] args ) {
		Employee em1 = new Employee("Samart", "Karuchit","SA", 100000);
		test();
		System.out.println( em1.checkPosition());
		Employee[] employees = new Employee[3];
		for (int i = 0; i < employees.length ;i++) {
			employees[i] = new Employee("Name" + i,"Lastname"+i, "Position"+i, i*10000);
		}
		
		for(Employee em : employees) {
			System.out.println(em.firstname + " " + em.lastname + " " + em.position + " Salary = " + em.salary);
		}
		
	}
	public void hello() {
		System.out.println("Hello " + this.firstname);
	}

	public int getSalary() {
		return salary;
	}
	public String checkPosition() {
		return position;
	}

	public static void test() {
		System.out.println("This is from static method");
	}
	
	public static boolean IsHuman() {
		return true;
	}
	public static void SayHello() {
		System.out.println("Hello");
	}
}

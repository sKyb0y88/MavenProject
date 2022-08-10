package Curs13;

public class Employee {
	
	String name;
	int salary;
	
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}

	public Employee(String nume, int salary) {
		setName(nume);
		setSalary(salary);
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private void setName(String nume) {
		this.name = nume;
		
	}

}

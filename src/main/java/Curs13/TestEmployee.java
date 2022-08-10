package Curs13;

public class TestEmployee {

	public static void main(String[] args) {
	
		EmployeeUtils<Developer> dev = new EmployeeUtils<Developer>(new Developer("Ionut", 2500));
		EmployeeUtils<Manager> manager = new EmployeeUtils<Manager>(new Manager("Oana", 2500));
		
		System.out.println("Dev : " + dev.getNume());
		System.out.println("Manager: " + manager.getNume());
		
		System.out.println("Este salariul la fel ?" + dev.isSalaryEqual(manager));
		
		
		
	}

}

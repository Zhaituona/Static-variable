package StaticMethod;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.empSalary();
		emp1.empVacation();
		// we can just calling the class name let the class using that static method , no need to create an object.//
		
		Employee.empSalary();
		
		SuperEmployee attila = new SuperEmployee();
		attila.empSalary();
		attila.empVacation();
		
		SuperEmployee.empSalary();


	}

}

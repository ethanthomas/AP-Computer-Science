package inheritance.employees;

public class Employee {
	private String myName;
	private int myEmployeeID;

	public Employee(String name, int employeeID) {
		myName = name;
		myEmployeeID = employeeID;
	}

	public String getName() {
		return myName;
	}

	public int getEmployeeID() {
		return myEmployeeID;
	}

	public static void main(String[] args) {
		SalesPartTime s = new SalesPartTime("Ken Blank", 18, 123, 12);

		System.out.println("Name: " + s.getName());
		System.out.println("ID: " + s.getEmployeeID());
		System.out.println("Code: " + s.getSecureCode());
		System.out.println("Hours: " + s.getHours());

		SalesAssistant d = new SalesAssistant("Fred Flintstone", 1, 25);
		SalesSupervisor f = new SalesSupervisor("Ken Blank", 18, 123, "aR62B", 12);
		Employee e = new Employee("John", 666);
		System.out.println("Assistant Class: " + d.getClass());

		System.out.println("Supervisor Class: " + f.getClass());
		System.out.println("Employee: " + e.getClass());
	}
}

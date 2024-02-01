package employee;
 
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		EmployeeManagementSystem empSystem = new EmployeeManagementSystem();
		Scanner scanner = new Scanner(System.in);
 
		while (true) {
			System.out.println("\nSelct one of the following options");
			System.out.println("1. Add a new employee");
			System.out.println("2. Remove an employee by ID");
			System.out.println("3. Display details of all employees");
			System.out.println("4. Exit");
 
			System.out.print("Enter your choice (1-4): ");
			String choice = scanner.nextLine();
 
			switch (choice) {
			case "1":
				System.out.print("Enter Employee ID: ");
				int employeeId = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Designation: ");
				String designation = scanner.nextLine();
				System.out.print("Enter Salary: "); 
				double salary = Double.parseDouble(scanner.nextLine());
				Employee employee= new Employee(employeeId, name, designation, salary);
				empSystem.addEmployee(employee);
				break;
 
			case "2":
				System.out.print("Enter Employee ID to remove: ");
				int removeEmployeeId = Integer.parseInt(scanner.nextLine());
				empSystem.removeEmployee(removeEmployeeId);
				break;
 
			case "3":
				empSystem.displayAllEmployees();
				break;
 
			case "4":
				System.out.println("Program is closed.");
				scanner.close();
				System.exit(0);
 
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			}
		}
	}
}
package employee;
 
import java.util.ArrayList;
 
public class EmployeeManagementSystem {
    private ArrayList<Employee> empList;
	public EmployeeManagementSystem() {
		// TODO Auto-generated constructor stub
		empList= new ArrayList<>();
	}
	public void addEmployee(Employee employee) {
        if (empList.contains(employee)) {
            System.out.println("Record is already inserted");
        } else {
            for (Employee existingEmployee : empList) {
                int existingEmployeeId = existingEmployee.getEmployeeId();
                if (existingEmployeeId == employee.getEmployeeId()) {
                    System.out.println("Employee ID" + employee.getEmployeeId() + " is already present in the record.");
                    return;
                }
            }
            empList.add(employee);
            System.out.println("Employee record added successfully");
        }
    }
   public void removeEmployee(int EmployeeId) {
	   for(Employee employee:empList) {
		   int employeeid=employee.getEmployeeId();
		  if (employeeid  == EmployeeId) {
			  empList.remove(employee);
              System.out.println("Employee with ID " + EmployeeId + " removed successfully.");
		  }
		  
	   }
       System.out.println("No employee found with ID " + EmployeeId + ".");
   }
   public void displayAllEmployees() {
	   if (empList.isEmpty()) {
           System.out.println("No employees in the system.");
       }
	   else {
		   for (Employee employee : empList) {
			  
				   employee.displayInfo();
			   
		   }
	   }
   }
 
 
}

package employee;
 
public class Manager extends Employee {
private String Department;
public Manager(Employee employee, String department) {
     super(employee.getEmployeeId(), employee.getName(), employee.getDesignation(), employee.getSalary());
     this.Department = department;
}
 
 
public void displayInfo() {
     super.displayInfo();
     System.out.println("Department: " + Department);
}
}
 
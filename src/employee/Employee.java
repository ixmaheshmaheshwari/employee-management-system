package employee;
 
public class Employee {
private int EmployeeId;
private String Name,Designation;
private double Salary;
public Employee(int employeeId, String name, String designation, double salary) {
    EmployeeId = employeeId;
    Name = name;
    Designation = designation;
    Salary = salary;
}
public int getEmployeeId() {
    return EmployeeId;
}

public String getName() {
    return Name;
}
 
public String getDesignation() {
    return Designation;
}
 
public double getSalary() {
    return Salary;
}
 
public void displayInfo() {
    System.out.println("Employee ID: " + EmployeeId);
    System.out.println("Name: " + Name);
    System.out.println("Designation: " + Designation);
    System.out.println("Salary: " + Salary);
}
}

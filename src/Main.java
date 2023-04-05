
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Create a new department
        Department department = new Department("Data Analyst");

        // Create some employees
        Employee emp1 = new Employee("Shantanu rokde", 45, 20000);
        Employee emp2 = new Employee("Shambo Raj", 39, 19000);
        Employee emp3 = new Employee("Rishita PJ", 29, 20000);

        // Add the employees to the department
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);




        // Display the department information using DepartmentDisplay
        DepartmentDisplay departmentDisplay = new DepartmentDisplay() {
            @Override
            public void displayDepartmentName(String departmentName) {
                System.out.println("Department Name: " + departmentName);
            }

            @Override
            public void displayDepartmentDetails(String departmentName, List<Employee> employees) {
                System.out.println("Department Name: " + departmentName);
                System.out.println("Number of Employees: " + employees.size());
                System.out.println("Employee Details:");
                for (Employee employee : employees) {
                    System.out.println(employee.getName() + " - " + employee.getAge() + " - " + employee.getSalary());
                }
            }
        };
        departmentDisplay.displayDepartmentName(department.getName());
        departmentDisplay.displayDepartmentDetails(department.getName(), department.getEmployees());

        // Display the employee information using EmployeeDisplay
        EmployeeDisplay employeeDisplay = new EmployeeDisplay() {
            @Override
            public void displayEmployeeDetails(Employee employee) {
                System.out.println("Name: " + employee.getName());
                System.out.println("Age: " + employee.getAge());
                System.out.println("Salary: " + employee.getSalary());
            }
        };
        for (Employee employee : department.getEmployees()) {
            employeeDisplay.displayEmployeeDetails(employee);
        }
    }
}






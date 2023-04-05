import java.util.*;

// Abstract class for displaying department information
public abstract class DepartmentDisplay {
    // Abstract method to display department name
    public abstract void displayDepartmentName(String departmentName);
    // Abstract method to display department details
    public abstract void displayDepartmentDetails(String departmentName, List<Employee> employees);
}
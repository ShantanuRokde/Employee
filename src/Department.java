import java.util.*;
public class Department

    {
        private String name;
        private List<Employee> employees;

        public Department(String name)
        {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public List<Employee> getEmployees()
        {
            return employees;
        }

        public void setEmployees(List<Employee> employees)
        {
            this.employees = employees;
        }

        public void addEmployee(Employee employee)
        {
            employees.add(employee);
        }

        public void removeEmployee(Employee employee)
        {
            employees.remove(employee);
        }
    }


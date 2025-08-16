/**
 * Represents an Employee with id, name, and salary.
 */
class Employee {
    /** Employee ID */
    private int id;
    /** Employee name */
    private String name;
    /** Employee salary */
    private double salary;

    /**
     * Constructor to initialize an Employee.
     * @param id Employee ID
     * @param name Employee name
     * @param salary Employee salary
     */
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    /** @return employee id */
    public int getId() {
        return id;
    }

    /** @return employee name */
    public String getName() {
        return name;
    }

    /** @return employee salary */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets a new salary.
     * @param salary new salary amount
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + name + ", salary=$" + salary + "]";
    }
}

/**
 * Manages multiple Employees.
 */
class EmployeeManager {
    /** Maximum number of employees */
    private static final int MAX_EMPLOYEES = 50;
    /** Array to store employees */
    private Employee[] employees;
    /** Current count of employees */
    private int count;

    /** Constructor to initialize the manager */
    public EmployeeManager() {
        employees = new Employee[MAX_EMPLOYEES];
        count = 0;
    }

    /**
     * Adds an employee if space available.
     * @param employee Employee to add
     * @return true if added, false if full
     */
    public boolean addEmployee(Employee employee) {
        if (count < MAX_EMPLOYEES) {
            employees[count++] = employee;
            return true;
        }
        return false;
    }

    /**
     * Finds an employee by ID.
     * @param id Employee ID to search
     * @return Employee if found, null otherwise
     */
    public Employee findEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    /** Lists all employees */
    public void listEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }
}

/**
 * Demo class for Employee Management System.
 */
public class EmployeeManagementApp {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee(101, "John Doe", 60000));
        manager.addEmployee(new Employee(102, "Jane Smith", 75000));

        System.out.println("All Employees:");
        manager.listEmployees();

        Employee emp = manager.findEmployee(102);
        if (emp != null) {
            emp.setSalary(80000);
            System.out.println("\nAfter salary update:");
            System.out.println(emp);
        }
    }
}

package ClassesAndObjects;

import EmployeePackage.Employee;

public class ExampleTwo {
    public static void main(String[] args) {
        Employee employee = new Employee("James", 1001, "13th St, New York");

        System.out.println("Employee Name is " +employee.emp_name+ " and Employee ID is " +employee.emp_id+ " and Employee Address is " +employee.address);
    }
}

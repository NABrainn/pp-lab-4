import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee Employees[] = new Employee[7];

        Manager employeeSix = new Manager("Ben", 1000, 0);
        Employee employeeSeven = new Employee("Harry", 300);
        Employee employeeEight = new Employee("Eric", 4500);
        Employee employeeNine = new Employee("Jimmy", 9000);
        Employee employeeTen = new Employee("Walter", 5000);

        Worker employeeEleven = new Worker("Jack", 1000, "Waiter");
        Employee employeeTwelve = new Employee("William", 200);

        Employees[0] = employeeSix;
        Employees[1] = employeeSeven;
        Employees[2] = employeeEight;
        Employees[3] = employeeNine;
        Employees[4] = employeeTen;

        Employees[5] = employeeEleven;
        Employees[6] = employeeTwelve;

        for(Employee employee : Employees) {
            employee.setSalary(employee.getSalary() + 500);
            if(employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(7500);
                employee.setSalary(7500);
            }
            System.out.println(employee);
        }
    }
}
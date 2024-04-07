import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee employees[] = new Employee[7];

        Manager employeeSix = new Manager("Ben", 1000, 0);
        Employee employeeSeven = new Employee("Harry", 300);
        Employee employeeEight = new Employee("Eric", 4500);
        Employee employeeNine = new Employee("Jimmy", 9000);
        Employee employeeTen = new Employee("Walter", 5000);

        Worker employeeEleven = new Worker("Jack", 1000, "Waiter");
        Employee employeeTwelve = new Employee("William", 200);

        employees[0] = employeeSix;
        employees[1] = employeeSeven;
        employees[2] = employeeEight;
        employees[3] = employeeNine;
        employees[4] = employeeTen;

        employees[5] = employeeEleven;
        employees[6] = employeeTwelve;

        for(Employee employee : employees) {
            employee.setSalary(employee.getSalary() + 500);
            if(employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(7500);
                employee.setSalary(7500);
            }
            System.out.println(employee);
        }
    }
}
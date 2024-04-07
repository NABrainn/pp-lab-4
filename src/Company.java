import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee Employees[] = new Employee[7];

        Manager employeeOne = new Manager("Ben", 1000, 0);
        Employee employeeTwo = new Employee("Harry", 300);
        Employee employeeThree = new Employee("Eric", 4500);
        Employee employeeFour = new Employee("Jimmy", 9000);
        Employee employeeFive = new Employee("Walter", 5000);

        Worker employeeSix = new Worker("Jack", 1000, "Waiter");
        Employee employeeSeven = new Employee("William", 200);

        Employees[0] = employeeOne;
        Employees[1] = employeeTwo;
        Employees[2] = employeeThree;
        Employees[3] = employeeFour;
        Employees[4] = employeeFive;

        Employees[5] = employeeSix;
        Employees[6] = employeeSeven;

        int count = 0;

        for(Employee employee : Employees) {
            if(!(employee instanceof Manager)) {
                count++;
            }
        }

        for(Employee employee : Employees) {
            if(!(employee instanceof Manager)) {
                employee.setSalary(employee.getSalary() + 500);

            }
            if(employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(count);
                employee.setSalary(7500);
            }
            System.out.println(employee);
        }
    }
}
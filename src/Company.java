import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee Employees[] = new Employee[5];

        Manager employeeOne = new Manager("Adam", 10000, 0);
        Worker employeeTwo = new Worker("Beth", 20000, "Cook");
        Employee employeeThree = new Employee("Johnny", 30000);
        Employee employeeFour = new Employee("Mark", 40000);
        Worker employeeFive = new Worker("Chris", 50000, "Garbage Collector");

        Employees[0] = employeeOne;
        Employees[1] = employeeTwo;
        Employees[2] = employeeThree;
        Employees[3] = employeeFour;
        Employees[4] = employeeFive;

        employeeOne.setSalary(7500);

        int count = 0;

        for(Employee employee : Employees) {
            if(!(employee instanceof Manager)) {
                count++;
            }
        }

        for(Employee employee : Employees) {
            if(employee instanceof Manager) {
                employeeOne.setNumberOfSubordinates(count);
            }
            System.out.println(employee);
        }
    }
}
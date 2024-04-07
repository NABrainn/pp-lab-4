import employees.Employee;
import employees.Manager;
import employees.Worker;

public class Company {
    public static void main(String[] args) {
        Employee employees[] = new Employee[5];

        Manager employeeOne = new Manager("Adam", 10000, 0);
        Worker employeeTwo = new Worker("Beth", 20000, "Cook");
        Employee employeeThree = new Employee("Johnny", 30000);
        Employee employeeFour = new Employee("Mark", 40000);
        Worker employeeFive = new Worker("Chris", 50000, "Garbage Collector");

        employees[0] = employeeOne;
        employees[1] = employeeTwo;
        employees[2] = employeeThree;
        employees[3] = employeeFour;
        employees[4] = employeeFive;

        employeeOne.setSalary(7500);

        int count = 0;

        for(Employee employee : employees) {
            System.out.println(employee);
            if(!(employee instanceof Manager)) {
                employeeOne.setNumberOfSubordinates(count++);
            }
        }
    }
}
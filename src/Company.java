public class Company {
    public static void main(String[] args) {
        Employee[] Employees = new Employee[5];

        Employee employeeOne = new Employee("Adam", 10000);
        Employee employeeTwo = new Employee("Beth", 20000);
        Employee employeeThree = new Employee("Johnny", 30000);
        Employee employeeFour = new Employee("Mark", 40000);
        Employee employeeFive = new Employee("Chris", 50000);

        Employees[0] = employeeOne;
        Employees[1] = employeeTwo;
        Employees[2] = employeeThree;
        Employees[3] = employeeFour;
        Employees[4] = employeeFive;

        System.out.println("Employee[3]: " + employeeFour);
        employeeFour.setSalary(540);

        for(Employee employee : Employees) {
            System.out.println(employee);
        }
    }
}
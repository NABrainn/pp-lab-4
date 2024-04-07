public class Company {
    public static void main(String[] args) {
        Employee employees[] = new Employee[5];

        Employee employeeOne = new Employee("Adam", 10000);
        Employee employeeTwo = new Employee("Beth", 20000);
        Employee employeeThree = new Employee("Johnny", 30000);
        Employee employeeFour = new Employee("Mark", 40000);
        Employee employeeFive = new Employee("Chris", 50000);

        employees[0] = employeeOne;
        employees[1] = employeeTwo;
        employees[2] = employeeThree;
        employees[3] = employeeFour;
        employees[4] = employeeFive;

        System.out.println("Employee[3]: " + employees[3]);
        System.out.println("Employee[3] salary: " + employees[3].getSalary());

        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
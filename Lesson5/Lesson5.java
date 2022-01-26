
/**
 * Java 1. Homework 5
 * 
 * @author Anna Trofimova
 * @version 26.1.2022
 */

class Lesson5 {
    public static void main(String[] args) {
        Employee[] employeeArr = new Employee[5];
        employeeArr[0] = new Employee("Ivan Aleksandrovich Kuznetsov", "Engineer", "iak@mailbox.com", "89321231133",
                90000,
                43);
        employeeArr[1] = new Employee("Roman Anatolyevich Hvorostovsky", "Accountant", "rah@mailbox.com", "89421235522",
                80000, 35);
        employeeArr[2] = new Employee("Daniel Yuryevich Tsiolkovskii", "Sales Manager", "dyt@mailbox.com",
                "89051236322",
                70000, 27);
        employeeArr[3] = new Employee("Yuliya Mikhaylovna Karnitskaya", "Director", "ymk@mailbox.com", "89131171122",
                100000, 41);
        employeeArr[4] = new Employee("Alexandra Nikolayevna Tsvetaeva", "Assistant", "ant@mailbox.com", "89521288122",
                30000, 25);
        for (Employee employee : employeeArr)
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
    }
}

class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee: " + fullName + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", "
                + age;
    }
}
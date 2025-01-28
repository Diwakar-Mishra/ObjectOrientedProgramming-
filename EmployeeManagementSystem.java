import java.util.*;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        PermanentEmployee emp1 = new PermanentEmployee(1, "Tushar", 1200, 500);
        ContractEmployee emp2 = new ContractEmployee(2, "Ranjan", 50, 10);
        emp1.calculateSalary();
        emp2.calculateSalary();
        System.out.println("Employee1 details :-");
        emp1.displayDetails();
        System.out.println("Employee2 details : ");
        emp2.displayDetails();
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void calculateSalary() {
        System.out.println("overridden in the derived class");
    }

    void displayDetails() {
        System.out.println("ID : " + id + " , Name : " + name + " , Salary : " + salary);
    }
}

class PermanentEmployee extends Employee {
    double bonus;

    PermanentEmployee(int id, String name, double salary, double bonus) {
        super(id, name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        salary += bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("permanent employee details : ");
        super.displayDetails();
        System.out.println("Bonus : " + bonus);
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        salary = hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Contract Employee details : ");
        super.displayDetails();
        System.out.println("Hourly rate : " + hourlyRate + " , Hours Worked : " + hoursWorked);
    }
}
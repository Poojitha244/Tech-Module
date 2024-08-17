import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    String department;
    String designationCode;
    int basic;
    int hra;
    int it;

    public Employee(int empNo, String empName, String department, String designationCode, int basic, int hra, int it) {
        this.empNo = empNo;
        this.empName = empName;
        this.department = department;
        this.designationCode = designationCode;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}

public class Project1 {

    public static void main(String[] args) {
        // Initialize employee data
        Employee[] employees = {
            new Employee(1001, "Ashish", "R&D", "e", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "PM", "c", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "Acct", "k", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "Front Desk", "r", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "Engg", "m", 50000, 20000, 20000),
            new Employee(1006, "Suman", "Manufacturing", "e", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "PM", "c", 29000, 12000, 10000)
        };

        // Designation details
        String[] designations = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] da = {20000, 32000, 12000, 15000, 40000};

        // Read the employee ID from command line arguments
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as a command line argument.");
            return;
        }

        int empId = Integer.parseInt(args[0]);
        Employee emp = null;

        // Search for the employee
        for (Employee e : employees) {
            if (e.empNo == empId) {
                emp = e;
                break;
            }
        }

        // If employee not found
        if (emp == null) {
            System.out.println("There is no employee with empid: " + empId);
            return;
        }

        // Find the designation and DA
        String designation = "";
        int daValue = 0;
        switch (emp.designationCode) {
            case "e":
                designation = designations[0];
                daValue = da[0];
                break;
            case "c":
                designation = designations[1];
                daValue = da[1];
                break;
            case "k":
                designation = designations[2];
                daValue = da[2];
                break;
            case "r":
                designation = designations[3];
                daValue = da[3];
                break;
            case "m":
                designation = designations[4];
                daValue = da[4];
                break;
        }

        // Calculate the salary
        int salary = emp.basic + emp.hra + daValue - emp.it;

        // Display the details
        System.out.println("Emp No: " + emp.empNo);
        System.out.println("Emp Name: " + emp.empName);
        System.out.println("Department: " + emp.department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of the employees in the company");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name, department, working hours per day, salary of the employee number " + (i + 1));
            String name, department;
            double workingHours;
            int salary;

            name = cin.next();
            department = cin.next();
            workingHours = cin.nextDouble();
            salary = cin.nextInt();

            emp[i] = new Employee(name, department,workingHours,salary);
        }

        //All the Employee whose salary is less than 500
        System.out.println("All the Employee whose salary is less than 500");
        for (int i = 0; i < n; i++) {
            if(emp[i].getSalary() < 500)
                System.out.println(emp[i].toString());
        }

        System.out.println();

        //All the Employee whose working hours exceed 8 hours.
        System.out.println("All the Employee whose working hours exceed 8 hours");
        for (int i = 0; i < n; i++) {
            if(emp[i].getNumberOfWorkingHoursPerDay() > 8) {
                System.out.println(emp[i].toString());
                emp[i].addWork();
            }
        }

        System.out.println();
        //All the Employee whose working hours exceed 8 hours After Adding Salary.
        System.out.println("All the Employee whose working hours exceed 8 hours After Adding Salary.");
        for (int i = 0; i < n; i++) {
            if(emp[i].getNumberOfWorkingHoursPerDay() > 8)
                System.out.println(emp[i].toString());
        }
    }
}
// 4
// Basil Software 8 60000
// Zyad Software 8 70000
// Mostafa Media 12 80000
// Ali HR 8 300
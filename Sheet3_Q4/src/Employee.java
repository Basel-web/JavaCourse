public class Employee {
    private String name;
    private String department;
    private double numberOfWorkingHoursPerDay;
    private int salary;

    public Employee(String name, String department, double numberOfWorkingHoursPerDay, int salary) {
        this.name = name;
        this.department = department;
        this.numberOfWorkingHoursPerDay = numberOfWorkingHoursPerDay;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getNumberOfWorkingHoursPerDay() {
        return numberOfWorkingHoursPerDay;
    }

    public void setNumberOfWorkingHoursPerDay(double numberOfWorkingHoursPerDay) {
        this.numberOfWorkingHoursPerDay = numberOfWorkingHoursPerDay;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void addSalary(){
        if(salary < 1000)
            salary += 500;
    }
    public void addWork(){
        if(numberOfWorkingHoursPerDay > 8)
            salary += 100;
    }
    @Override
    public String toString(){
        return "Name: " + name +
                " Department: " + department +
                " Working Hours Per Day: " + numberOfWorkingHoursPerDay +
                " Salary: " + salary;
    }

}

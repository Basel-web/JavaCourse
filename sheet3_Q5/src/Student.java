import java.util.Arrays;

public  class Student{
    private int rollingNumber;
    private String name;
    private Date d;
    private static int maxDegree = 100;
    private double[] ar_degree ;
    private double[] CGPAs;
    private static int count;

    public Student(int rollingNumber, String name, Date d, double[] ar_degree, double[] CGPAs) {
        this.rollingNumber = rollingNumber;
        this.name = name;
        this.d = d;
        this.ar_degree = ar_degree;
        this.CGPAs = CGPAs;
        count++;
    }
    public Student(){
        count++;
        ar_degree = new double[]{0, 0, 0};
        CGPAs = new double[]{0,0,0,0,0};
        d = new Date(11,2,2000);
        name = "";

    }

    public int getRollingNumber() {
        return rollingNumber;
    }

    public void setRollingNumber(int rollingNumber) {
        this.rollingNumber = rollingNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public static int getMaxDegree() {
        return maxDegree;
    }

    public static void setMaxDegree(int maxDegree) {
        Student.maxDegree = maxDegree;
    }

    public double[] getAr_degree() {
        return ar_degree;
    }

    public void setAr_degree(double[] ar_degree) {
        this.ar_degree = ar_degree;
    }

    public double[] getCGPAs() {
        return CGPAs;
    }

    public void setCGPAs(double[] CGPAs) {
        this.CGPAs = CGPAs;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }
    public double calcGrad(){
        double ans = 0;
        for (int i = 0; i < 3; i++) {
            ans += ar_degree[i];
        }
        return ans / 3;
    }
    public void display(){
        System.out.println("rolling number: " + rollingNumber + "\n" + "name: " + name + "\n" + "birthDate: ");
        System.out.print("Date: ");d.displayDate();
        System.out.println("maxDegree : " + maxDegree +"\nDegrees: " + Arrays.toString(ar_degree) + "\nCGPAs for 5 semesters" + Arrays.toString(CGPAs) + "\ncalculatedGrade " + calcGrad());
    }
}
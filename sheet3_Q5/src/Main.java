import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Testing Data class
        Date date1 = new Date(19, 5, 2003);
        Date date2 = new Date(1, 4, 2003);
        Date date3 = new Date(9, 3, 2003);
        date1.displayDate();
        System.out.println(date1.equals(date2));
        System.out.println("\n");
        // Testing Student class
        double[] student1Degree = {90, 70, 80};
        double[] GPA1 = {2.4, 2.2, 2.1, 2.9, 3.3};
        double[] student2Degree = {50, 70, 90};
        double[] GPA2 = {1.4, 2.2, 2.1, 2.9, 3.3};
        double[] student3Degree = {50, 30, 17};
        double[] GPA3 = {2.5, 2.1, 1.9, 1.9, 2.3};
        Student s1 = new Student(Student.getCount()+ 1,"Basil", date1,student1Degree,GPA1);
        Student s2 = new Student(Student.getCount()+ 1,"Ali", date2,student2Degree,GPA2);
        Student s3 = new Student(Student.getCount()+ 1,"Mona", date3,student3Degree,GPA3);

        s1.display();
        System.out.println("\n\n");
        s2.display();
        System.out.println("\n\n");
        s3.display();
        System.out.println("\n\n");


        // Testing StudentTest class
        Student[] arOfStudents = {s1,s2,s3};
        StudentTest st1 = new StudentTest(arOfStudents);
//        st1.insertStudentData(0,Student.getCount()+ 1,"Basil", date1,student1Degree,GPA1);
//        st1.insertStudentData(1,Student.getCount()+ 1,"Basil", date2,student2Degree,GPA2);
//        st1.insertStudentData(2,Student.getCount()+ 1,"Basil", date3,student3Degree,GPA3);
        st1.studentWithHighestDegree().display();
        System.out.println("\n\n");
        Student[] sp = st1.probation();
        for (Student student : sp) {
            if(!Objects.equals(student.getName(), ""))
                student.display();
            System.out.println("\n");
        }
    }
}

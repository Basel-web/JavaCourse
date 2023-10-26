public class StudentTest{
    private Student[] s;

    public StudentTest(Student[] s) {
        this.s = s;
    }

    public Student[] getS() {
        return s;
    }

    public void setS(Student[] s) {
        this.s = s;
    }
    public void insertStudentData(int index, int rollingNumber, String name, Date d, double[] ar_degree, double[] CGPAs){
        if(index >= 0 && index < s.length)
            s[index] = new Student(rollingNumber, name, d, ar_degree, CGPAs);
    }
    public Student studentWithHighestDegree(){
        Student ret = new Student();
        for (Student i : s) {
            if (i.calcGrad() > ret.calcGrad())
                ret = i;
        }
        return ret;
    }
    public Student[] probation(){
        Student[] ret = new Student[s.length];
        int it = 0;
        for (int i = 0; i < s.length; i++) {
            ret[i] = new Student();
            for (int j = 1; j < 5; j++) {
                if(s[i].getCGPAs()[j - 1] < 2 && s[i].getCGPAs()[j] < 2 ){
                    ret[it] = s[i];
                    it++;
                    break;
                }
            }
        }
        return ret;
    }
}

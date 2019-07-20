package Task2;

public class MarksCalculationService {
    public int GPA (Student student){
        int amount_estimates = 0;
        for (int x:student.getStudentProgress().getStudentGrades()) {
            amount_estimates += x;
        }
        return amount_estimates/student.getStudentProgress().getStudentGrades().length;
    }
    public int SumMarks(Student student) {
        int sum = 0;
        for(int x:student.getStudentProgress().getStudentGrades()){
            sum +=x;
        }
        return sum;
    }
    public double GradePointAverage (Group group){
        double sum = 0;
        for (Student student:group.getStudents()) {
            sum += SumMarks(student);
        }
        return sum/25;
    }
    
}

package Task2;

public class MarksCalculationService implements IMarksCalculationService {
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
    public boolean SearchStudentExcellent(Student student){
        return GPA(student)==5;
    }
    public boolean SearchStudentLosers(Student student){
        for(int mark:student.getStudentProgress().getStudentGrades()){
            if(mark<=3) return true;
        }
        return false;
    }
    public int numberLoserStudents(Group group){
        int count = 0;
        for(Student student: group.getStudents()){
            if(SearchStudentLosers(student)) count++;
            else continue;
        }
        return count;
    }
    public int numberExcellentStudents(Group group){
        int count = 0;
        for(Student student: group.getStudents()){
            if(SearchStudentExcellent(student)) count++;
            else continue;
        }
        return count;
    }
}

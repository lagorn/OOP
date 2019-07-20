package Task2;

public class MarksCalculationService {
    public int GPA (int [] studentGrades){
        int amount_estimates = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            amount_estimates += studentGrades[i];
        }
        return amount_estimates/studentGrades.length;
    }
    public double GradePointAverage (Group group){
        group.getStudents()
    }

}

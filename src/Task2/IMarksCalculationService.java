package Task2;

public interface IMarksCalculationService {
    int GPA (Student student);
    int SumMarks(Student student);
    double GradePointAverage (Group group);
    boolean SearchStudentExcellent(Student student);
    boolean SearchStudentLosers(Student student);
    int numberLoserStudents(Group group);
    int numberExcellentStudents(Group group);
}

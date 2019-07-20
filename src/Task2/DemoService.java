package Task2;

public class DemoService {
    public void execute(){
        System.out.println("Создаем 5 студентов");

        int [] arraymarks1 = {2,3,2,4,5};
        int [] arraymarks2 = {3,3,2,4,5};
        int [] arraymarks3 = {2,3,4,4,4};
        int [] arraymarks4 = {5,5,5,5,5};
        int [] arraymarks5 = {2,2,2,4,2};

        StudentProgress MarksFirstStudent = new StudentProgress(arraymarks1);
        StudentProgress MarksSecondStudent = new StudentProgress(arraymarks2);
        StudentProgress MarksThirdStudent = new StudentProgress(arraymarks3);
        StudentProgress MarksFourthStudent = new StudentProgress(arraymarks4);
        StudentProgress MarksFifthStudent = new StudentProgress(arraymarks5);

        Student student1 = new Student("Ivanov I.F.",1, MarksFirstStudent);
        Student student2 = new Student("Petrov G.I.",2, MarksSecondStudent);
        Student student3 = new Student("Sidorov I.V.",3, MarksThirdStudent);
        Student student4 = new Student("Pipcin E.G.",4, MarksFourthStudent);
        Student student5 = new Student("Nutov W.Z.",5, MarksFifthStudent);

        Group group = new Group()

    }
}

package Task2;

public class Group {
    private String name;
    private Student[] students = new Student[5];

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }
}

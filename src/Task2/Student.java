package Task2;

import java.util.Objects;

public class Student {
    private String vio;
    private int studentNumber;
    private StudentProgress studentProgress;

    public Student(String vio, int studentNumber, StudentProgress studentProgress) {
        this.vio = vio;
        this.studentNumber = studentNumber;
        this.studentProgress = studentProgress;
    }

    public String getVio() {
        return vio;
    }

    public void setVio(String vio) {
        this.vio = vio;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public StudentProgress getStudentProgress() {
        return studentProgress;
    }

    public void setStudentProgress(StudentProgress studentProgress) {
        this.studentProgress = studentProgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentNumber() == student.getStudentNumber() &&
                getVio().equals(student.getVio()) &&
                getStudentProgress().equals(student.getStudentProgress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVio(), getStudentNumber(), getStudentProgress());
    }
}

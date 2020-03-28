public class Course {
    private String nameOfCourse;
    private int numCredits;
    private int grade;

    public Course(String nameOfCourse, int numCredits, int grade) {
        this.nameOfCourse = nameOfCourse;
        this.numCredits = numCredits;
        this.grade = grade;
    }

    public int getCredits() {
        return numCredits;
    }

    public int getGrade() {
        return grade;
    }

    public String toString() {
        return nameOfCourse + ": " + grade;
    }
}

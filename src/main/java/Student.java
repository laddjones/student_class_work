public class Student {
    String nameofStudent;
    Course[] courses;

    public Student(String nameofStudent, Course[] courses) {
        this.nameofStudent = nameofStudent;
        this.courses = courses;
    }

    public int getCredits() {
        int totalHours = 0;
        for (Course thereCoursess : courses) {
            totalHours = thereCoursess.getCredits();
        }
        return totalHours;
    }

    public String toString() {
        System.out.println(nameofStudent + " is taking " + courses.length + " courses ");
        for (Course thereCourses : courses) {
            System.out.println(thereCourses.toString());
        }
        return "";
    }


    public double getGPA() {
        double averages = 0;
        for (Course thereCouresss: courses) {
            averages = (thereCouresss.getGrade())/(thereCouresss.getCredits());
        }
        return averages;
    }

}

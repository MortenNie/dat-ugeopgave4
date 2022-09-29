import java.util.ArrayList;

public class Student {
    int n = 5;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>(n);

    Student (String name) {

        this.name = name;


    }

    public void addCourse(Course hold) {

        courses.add(hold);



    }

    public String toString() {

        return "Student: " + name + " " + courses;


    }


}

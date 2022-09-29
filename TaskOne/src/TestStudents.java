public class TestStudents {
    public static void main(String[] args) {
        Student s1 = new Student("Morten");
        Student s2 = new Student("Jakob");
        Student s3 = new Student("Dimitra");

        Course c1 = new Course("Tysk");
        Course c2 = new Course("Matematik");
        s1.addCourse(c1);
        s2.addCourse(c2);
        System.out.println(s1);
        System.out.println(s2);


    }

}

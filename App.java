/**
 * APP TO TEST MY CLASSES
 */
public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Lucas", 18, "UO111111");
        Student student2 = new Student();
        Student student3 = new Student(student2);
        //System.out.println(student1 + " " + student3);

        Register<Student> school1 = new Register<>();
        school1.add(student1); school1.add(student2);
        school1.add(student3);
        System.out.println(school1);

    }
}

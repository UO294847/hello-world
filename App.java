/**
 * APP TO TEST MY CLASSES
 */
public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Lucas", 18, "UO111111");
        Student student2 = new Student();
        Student student3 = new Student(student2);
        //System.out.println(student1 + " " + student3);

        Register<Student> register = new Register<>();
        register.add(student1); register.add(student2);
        register.add(student3);
        System.out.println(register);

        School IESCarreñoMiranda = new School(register,"IES Carreño Miranda");
        System.out.println(IESCarreñoMiranda);
        
    }
}

package homeWorks.homeWork4;

public class StudentTest {

    public static double grandGpa(Student student){
        double grandGpa = (student.mathGpa + student.economicsGpa + student.foreignLangGpa)/3;
        return grandGpa;
    }
    public static void main(String[] args) {
        Student Anna = new Student(2546, "Anna", "Smith", 4, 4.6, 4.9, 4.98);
        Student Jack = new Student(2536, "Jack", "O'Brian", 2, 4.7, 4.2, 3.7);
        Student Jane = new Student(2576, "Jane", "McCurley", 1, 3.9, 4.3, 4.1);
        System.out.println("Jane's total GPA: " + grandGpa (Jane));
        System.out.println("Jack's total GPA: " + grandGpa (Jack));
        System.out.println("Anna's total GPA: " + grandGpa (Anna));
    }
}
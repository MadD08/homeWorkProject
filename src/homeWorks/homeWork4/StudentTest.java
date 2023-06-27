package homeWorks.homeWork4;

public class StudentTest {
    public static void main(String[] args) {
        Student Anna = new Student(2546, "Anna", "Smith", 4, 4.6, 4.9, 4.98);
        Student Jack = new Student(2536, "Jack", "O'Brian", 2, 4.7, 4.2, 3.7);
        Student Jane = new Student(2576, "Jane", "McCurley", 1, 3.9, 4.3, 4.1);
        double grandGpaAnna = (Anna.mathGpa + Anna.economicsGpa + Anna.foreignLangGpa) / 3;
        double grandGpaJack = (Jack.mathGpa + Jack.economicsGpa + Jack.foreignLangGpa) / 3;
        double grandGpaJane = (Jane.mathGpa + Jane.economicsGpa + Jane.foreignLangGpa) / 3;
        System.out.println("Jane's total GPA: " + grandGpaJane);
        System.out.println("Jack's total GPA: " + grandGpaJack);
        System.out.println("Anna's total GPA: " + grandGpaAnna);
    }
}
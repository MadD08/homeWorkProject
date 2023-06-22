package homeWorks.homeWork4;

public class Student {
    int id;
    String firstName;
    String secondName;
    int course;
    double mathGpa;
    double economicsGpa;
    double foreignLangGpa;

    public Student(int id, String firstName, String secondName, int course, double mathGpa, double economicsGpa, double foreignLangGpa) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.course = course;
        this.mathGpa = mathGpa;
        this.economicsGpa = economicsGpa;
        this.foreignLangGpa = foreignLangGpa;
    }
}

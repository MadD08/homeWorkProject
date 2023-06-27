package homeWorks.homeWork4;

public class Employee {
    private double salary;
    public String surname;
    protected int id;

    public void displaySalary() {
        System.out.println(salary);
    }

    public void displaySurname() {
        System.out.println(surname);
    }

    public void displayId() {
        System.out.println(id);
    }

    private Employee(double salary, String surname, int id){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

}
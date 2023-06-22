package homeWorks.homeWork4;

public class Employee {
    private double salary;
    public String surname;
    protected int id;

    public void DisplaySalary() {
        System.out.println(salary);
    }

    public void DisplaySurname() {
        System.out.println(surname);
    }

    public void DisplayId() {
        System.out.println(id);
    }

    Employee(double salary, String surname, int id){
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }



}

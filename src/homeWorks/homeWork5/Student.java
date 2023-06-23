package homeWorks.homeWork5;

public class Student {
    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (1 <= course && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (1 <= grade && grade <= 10) {
            this.grade = grade;
        }
    }

    public void showInfo(){
        System.out.println("Name "  + getName());
        System.out.println("Grade "  + getGrade());
        System.out.println("Course "  + getCourse());
    }
}

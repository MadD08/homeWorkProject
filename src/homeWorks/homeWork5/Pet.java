package homeWorks.homeWork5;

public class Pet extends Animal {
    String name;
    static int tail = 1;
    static int paw = 4;

    public Pet() {
        System.out.println("I am Pet");
        eyes = 2;
    }

    public void run (){
        System.out.println("Pet runs");
    }

    public void jump (){
        System.out.println("Pet jumps");
    }
}

package homeWorks.homeWork5;

public class Cat extends Pet{
    String name;

    public void sleeps (){
        System.out.println("Cat sleeps");
    }

    public Cat (String name){
        this.name = name;
        System.out.println("I am a cat and my name is: " + name);
    }
}

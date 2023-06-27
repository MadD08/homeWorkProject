package homeWorks.homeWork5;

public class Dog extends Pet{
    String name;

    public void play (){
        System.out.println("Dog plays");
    }

    public Dog (String name){
        this.name = name;
        System.out.println("I am a dog and my name is: " + name);
    }
}

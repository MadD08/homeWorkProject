package homeWorks.homeWork6;

import java.util.List;
import java.util.stream.Collectors;

public class CarsClass {
    private String color;
    private String name;
    private int price;

    public CarsClass(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        CarsClass car1 = new CarsClass("First", "green", 50000);
        CarsClass car2 = new CarsClass("Second", "red", 75000);
        CarsClass car3 = new CarsClass("Third", "blue", 50000);
        CarsClass car4 = new CarsClass("Fourth", "green", 60000);

        List<CarsClass> cars = List.of(car1, car2, car3, car4);
        List<CarsClass> greenCars = cars.stream().filter(car -> car.getColor() == "green").collect(Collectors.toList());
        System.out.println("Green Cars: " + greenCars);
        List<CarsClass> carsForFiftyK = cars.stream().filter(car -> car.getPrice() == 50000).collect(Collectors.toList());
        System.out.println("Cars for 50 grand: " + carsForFiftyK);
    }

}

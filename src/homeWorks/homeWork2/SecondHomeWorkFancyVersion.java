package homeWorks.homeWork2;

import java.util.Scanner;

//Arguments in all methods were added solely to make methods overloaded

public class SecondHomeWorkFancyVersion {

    public static void sumOfParts(int a) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input one number:");
        number = input.nextInt();
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }

    public static void sumOfParts(String b) {
        int numberOfCharacters = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your phrase:");
        String input = scan.nextLine();
        String[] phrase = input.split("\\s+");
        for (int counter = 0; phrase.length > counter; counter++) {
            numberOfCharacters = numberOfCharacters + phrase[counter].length();
        }
        System.out.println("Кількість букв " + numberOfCharacters);
    }

    public static void sumOfParts(boolean b) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Input one number:");
        number = input.nextInt();
        if (number > 0) {
            System.out.println("Number is greater than zero");
        } else {
            System.out.println("Number is less than zero");
        }
    }

    public static void main(String[] args) {
        sumOfParts(2);
        sumOfParts("test");
        sumOfParts(true);
    }

}

package homeWorks.homeWork2;

import java.util.Scanner;

//Arguments in all methods were added solely to make methods overloaded

public class SecondHomeWorkFancyVersion {

    public static void sumOfParts(int a) {
        int number, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть одне число:");
        number = input.nextInt();
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Сума цифр " + sum);
    }

    public static void sumOfParts(String b) {
        int numberOfCharacters = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть Ваші слова:");
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
        System.out.println("Введіть одне число:");
        number = input.nextInt();
        if (number>0){
            System.out.println("Число більше нуля");
        }else{
            System.out.println("Число менше або дорівнює нулю");
        }
    }

    public static void main(String[] args) {
        sumOfParts(2);
        sumOfParts("test");
        sumOfParts(true);
    }

}

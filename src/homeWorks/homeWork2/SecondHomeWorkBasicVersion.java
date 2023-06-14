package homeWorks.homeWork2;

public class SecondHomeWorkBasicVersion {
    public static void sumOfParts(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Сума цифр " + sum);
    }

    public static void sumOfParts(String firstWord, String secondWord) {
        int numberOfCharacters = firstWord.length() + secondWord.length();
        System.out.println("Кількість букв " + numberOfCharacters);
    }

    public static void sumOfParts(boolean b) {
        int number = 15;
        if (number > 0) {
            System.out.println("Число більше нуля");
        } else {
            System.out.println("Число менше або дорівнює нулю");
        }
    }

    public static void main(String[] args) {
        sumOfParts(896);
        sumOfParts("test", "test");
        sumOfParts(true);
    }
}

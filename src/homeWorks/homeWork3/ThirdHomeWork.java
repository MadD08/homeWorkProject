package homeWorks.homeWork3;

public class ThirdHomeWork {

    public static void lengthComparison(String word1, String word2, String word3) {

        if (word1.length() > word2.length() && word1.length() > word3.length()) {
            System.out.println(word1 + " is the longest word");
        } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
            System.out.println(word2 + " is the longest word");
        } else {
            System.out.println(word3 + " is the longest word");
        }
    }

    public static void daysInMonthIdentifier(int days) {
        switch (days) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in the month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days in the month");
                break;
            case 2:
                System.out.println("There are 28 days in the month");
                break;
            default:
                System.out.println("Enter proper number of month");
                break;
        }
    }

    public static void rightFullTriangle(int rows) {
        int i, j;
        for (i = 0; i <= rows - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        for (i = rows - 1; i >= 0; i--) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }

    public static void leftLowerQuarterTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void leftUpperQuarterTriangle(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        lengthComparison("first_word", "test_test", "test");
        daysInMonthIdentifier(8);
        rightFullTriangle(5);
        leftLowerQuarterTriangle(5);
        leftUpperQuarterTriangle(5);
    }

}

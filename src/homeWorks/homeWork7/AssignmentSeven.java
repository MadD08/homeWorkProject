package homeWorks.homeWork7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentSeven {
    private static int[] numbers = {3, 6, 12, 32, 41};
    private static int delimiter = 0;

    public static void divide() {
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = numbers[i] / delimiter;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException is detected");
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void compare() {
        List<String> phones = new ArrayList<>();
        phones.add("+380957785963");
        phones.add("+125897745663");
        phones.add("+986036658945");
        String regex = "^(\\+)?(380)?[0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        for (String phone : phones) {
            Matcher matcher = pattern.matcher(phone);
            System.out.println(phone + ": " + matcher.matches());
        }
    }

    public static void main(String[] args) {
        divide();
        compare();
    }
}

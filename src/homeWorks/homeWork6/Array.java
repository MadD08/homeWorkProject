package homeWorks.homeWork6;

import java.util.Arrays;

public class Array {
    static int[] array = {5, 11, 7, 20};

    public static void main(String[] args) {
        Arrays.sort(array);
        int minDifference = array[1] - array[0];
        for (int i = 2; i != array.length; i++) {
            minDifference = Math.min(minDifference, array[i] - array[i - 1]);
        }
        System.out.println(minDifference);
    }
}

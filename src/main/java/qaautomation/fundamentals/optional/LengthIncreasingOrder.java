package qaautomation.fundamentals.optional;

import java.util.Arrays;
//Вывести числа в порядке возрастания значений их длины.

public class LengthIncreasingOrder {
    public static void main(String[] args) {
        int[] numbers = {777, 3255, 492999, 12500, 555};
        int[] arrayOfLengths = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arrayOfLengths[i] = Integer.toString(numbers[i]).length();
        }

        Arrays.sort(arrayOfLengths);
        int n = arrayOfLengths.length;
        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (arrayOfLengths[j] != arrayOfLengths[i]) {
                    if (m != j) arrayOfLengths[m] = arrayOfLengths[j];
                    m++;
                }
            }
        }
        if (n != arrayOfLengths.length) {
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = arrayOfLengths[i];
            }
            arrayOfLengths = b;
        }


        for (int j = 0; j < arrayOfLengths.length; j++) {
            for (int k = 0; k < numbers.length; k++)
                if (arrayOfLengths[j] == Integer.toString(numbers[k]).length()) {
                    System.out.println(numbers[k]);
                }
        }
    }
}
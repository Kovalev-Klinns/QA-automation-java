package qaautomation.fundamentals.optional;

import java.util.Arrays;
//Вывести на консоль те числа, длина которых меньше средней длины по всем числам, а также длину.

public class LessThanAverageLength {
    public static void main(String[] args) {
        int[] numbers = {5, 777, 3255, 492999, 12500, 79, 228};
        int[] arrayOfLengths = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            arrayOfLengths[i] = Integer.toString(numbers[i]).length();
        }
        int averageValue = Arrays.stream(arrayOfLengths).sum() / arrayOfLengths.length;
        for (int j = 0; j < arrayOfLengths.length; j++) {
            if (arrayOfLengths[j] < averageValue) {
                System.out.println("Число " + numbers[j] + ", длина: " + arrayOfLengths[j]);
            }
        }
    }
}

package qaautomation.fundamentals.optional;
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class FindNumber {
    public static void main(String[] args) {
        int[] values = {22, 36, 28467, 255, 7, 3999};
        int lowerNumber = values[0];
        int largeNumber = 0;
        for (int i = 0; i < values.length; i++) {
            while (values[i] < lowerNumber) {
                lowerNumber = values[i];
            }
            while (values[i] > largeNumber) {
                largeNumber = values[i];
            }
        }
        System.out.println("Наименьшее число - " + lowerNumber + ", его длина - " + Integer.toString(lowerNumber).length());
        System.out.println("Наибольшее число - " + largeNumber + ", его длина - " + Integer.toString(largeNumber).length());
    }
}



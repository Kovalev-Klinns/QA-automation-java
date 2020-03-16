package qaautomation.fundamentals.optional;
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class FindNumber {
    public static void main(String[] args) {
        int[] values = {22, 36, 28467, 255, 71, 3999, 9};
        int numberWithShortLength = values[0];
        int numberWithLongLength = 0;
        int shortLength = Integer.toString(values[0]).length();
        int longLenght = 0;
        for (int i = 0; i < values.length; i++) {
            while (true) {
                int length = Integer.toString(values[i]).length();
                if (length >= shortLength) break;
                shortLength = length;
                numberWithShortLength = values[i];
            }
            while (Integer.toString(values[i]).length() > longLenght) {
                longLenght = Integer.toString(values[i]).length();
                numberWithLongLength = values[i];
            }
        }
        System.out.println("Число с наименьшей длиной - " + numberWithShortLength + ", его длина - " + shortLength);
        System.out.println("Число с наибольшей длиной - " + numberWithLongLength + ", его длина - " + longLenght);
    }
}



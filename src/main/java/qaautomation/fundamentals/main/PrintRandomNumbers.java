package qaautomation.fundamentals.main;
// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class PrintRandomNumbers {
    public static void main(String[] args) {
        long[] numbers = new long[5];
        System.out.println("Вывод с переходом на новую строку:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(Math.random() * 1000);
            System.out.println(numbers[i]);
        }

        System.out.println("Без перехода:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

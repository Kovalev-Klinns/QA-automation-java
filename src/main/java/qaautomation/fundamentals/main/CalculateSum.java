package qaautomation.fundamentals.main;
// 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class CalculateSum {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < args.length; i++)
        {
            int x = Integer.parseInt(args[i]);
            sum = sum + x;
            product = product * x;
        }
        System.out.println("Sum : " + sum);
        System.out.println("Product : "+ product);
    }
}


package qaautomation.fundamentals.main;
// 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class ArgumentsReverse {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        for( int i = args.length - 1 ; i >= 0 ; i--)
            System.out.println(args[i] + " ");
    }
}

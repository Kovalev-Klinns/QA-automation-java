package qaautomation.fundamentals.main;
import java.util.Scanner;
// 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

public class Months {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 12: ");
        System.out.println("(При вводе числа 0 работа программы будет прервана)");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int month = scanner.nextInt();
            switch (month) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Январь");
                    break;
                case 2:
                    System.out.print("Февраль");
                    break;
                case 3:
                    System.out.print("Март");
                    break;
                case 4:
                    System.out.print("Апрель");
                    break;
                case 5:
                    System.out.print("Май");
                    break;
                case 6:
                    System.out.print("Июнь");
                    break;
                case 7:
                    System.out.print("Июль");
                    break;
                case 8:
                    System.out.print("Август");
                    break;
                case 9:
                    System.out.print("Сентябрь");
                    break;
                case 10:
                    System.out.print("Октябрь");
                    break;
                case 11:
                    System.out.print("Ноябрь");
                    break;
                case 12:
                    System.out.print("Декабрь");
                    break;
                default:
                    System.out.println("Неккоректное число. Пожалуйста, введите число соответствующее месяцу года.");
                    break;
            }
            System.out.println();
        }
    }
}

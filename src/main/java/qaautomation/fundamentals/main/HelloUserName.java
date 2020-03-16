package qaautomation.fundamentals.main;
import java.util.Scanner;
// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class HelloUserName {
    public static void main(String[] args) {
        System.out.println("Введите свое имя");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        System.out.println("Hello " + userName + "!");
    }
}
package qaautomation.collections.main;

import qaautomation.collections.main.candy.Candy;
import qaautomation.collections.main.candy.Chocolate;
import qaautomation.collections.main.candy.Lollipop;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
//Новогодний подарок. Определить иерархию конфет и прочих сладостей. Создать несколько объектов-конфет.
// Собрать детский подарок с определением его веса. Провести сортировку конфет в подарке на основе одного из параметров.
// Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.

public class ConfectioneryRunner {
    public static void main(String[] args) throws Exception {
        System.out.println("Happy new year! You got a sweet present! :)");
        System.out.println("Print \"y\" if you want to open it, or \"n\" if you don't (the program's work will be finished)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        while (!Pattern.matches("[yn]", input)) {
            System.out.print("Wrong input!");
            input = scanner.next();
        }
        if (input.equals("n")) {
            System.out.println(":C");
            System.exit(0);
        }

        CandyBox candyBox = new CandyBox(new ArrayList<Candy>());
        candyBox.getContent().add(new Chocolate(12.4, 44));
        candyBox.getContent().add(new Chocolate(11.7, 60));
        candyBox.getContent().add(new Lollipop(12.1, 52));
        candyBox.getContent().add(new Chocolate(12.8, 62));
        candyBox.getContent().add(new Chocolate(13.8, 63));
        candyBox.getContent().add(new Lollipop(25.9, 20));
        candyBox.getContent().add(new Lollipop(14.9, 33));
        candyBox.getContent().add(new Chocolate(11.2, 64));
        candyBox.getContent().add(new Lollipop(15.9, 40));
        candyBox.getContent().add(new Chocolate(12.7, 35));

        candyBox.sortByWeight();
        candyBox.calculateTotalWeight();
        candyBox.findSweetsInRange(scanner);
    }
}

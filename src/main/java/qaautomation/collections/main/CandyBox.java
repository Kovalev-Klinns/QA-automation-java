package qaautomation.collections.main;

import qaautomation.collections.main.candy.Candy;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CandyBox {
    private static ArrayList<Candy> content;

    public CandyBox(ArrayList<Candy> content) {
        this.content = content;
    }

    // Сортировка по весу: конфеты с большим весом на дне коробки
    public void sortByWeight() {
        content.sort(new CandyWeightComparator());
        for (Candy e : content) {
            System.out.println(e);
        }
        System.out.println();
    }

    // Подсчет общего веса всех конфет
    public void calculateTotalWeight() {
        double sum = 0;
        for (int i = 0; i < content.size(); i++) {
            sum += content.get(i).getWeight();
        }
        System.out.println("Full weight candy from the box - " + Math.round(sum) + " grams");
        System.out.println();
    }

    // Поиск конфет по содержанию сахара в заданном диапазоне
    public void findSweetsInRange(Scanner scanner) throws InputMismatchException {
        System.out.println("Search for candy by sugar content in a given range");
        System.out.println("Indicate the lower limit of the range (integers only!)");
        while (!scanner.hasNextInt()) {
                System.err.println("Please enter integer value");
                scanner.nextLine();
        }
        int lowerLimit = scanner.nextInt();

        System.out.println("Indicate the upper limit of the range (integers only!)");
        while (!scanner.hasNextInt()) {
            System.err.println("Please enter integer value");
            scanner.nextLine();
        }
        int upperLimit = scanner.nextInt();

        // Вывод конфет с содержанием сахара в указанном диапозоне
        System.out.println("Candy with sugar content from " + lowerLimit + " to " + upperLimit + ":");
        for (Candy e : content) {
            if(e.getSugarContent() >= lowerLimit && e.getSugarContent() <= upperLimit) {
                System.out.println(e);
            }
        }
    }

        public ArrayList<Candy> getContent () {
            return content;
        }

        public void setContent (ArrayList <Candy> content) {
            this.content = content;
    }
}

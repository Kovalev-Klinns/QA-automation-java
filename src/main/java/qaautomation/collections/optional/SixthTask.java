package qaautomation.collections.optional;

// Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
import java.io.*;
import java.util.*;

public class SixthTask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/sixth_collections_task.txt"));
        ArrayList<String> linesFromFile = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            linesFromFile.add(line);
        }
        // Сортировка согласно алфавитному порядку
        Collections.sort(linesFromFile);
            System.out.println(linesFromFile);
        }
}


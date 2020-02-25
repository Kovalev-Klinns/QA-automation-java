package qaautomation.collections.optional;

// Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("first_collections_task.txt"));
            List<String> linesFromFile = new LinkedList<>();
            String line;
            while ((line = br.readLine()) != null) {
                linesFromFile.add(line);
            }
            br.close();

            PrintWriter pw = new PrintWriter(new FileWriter("first_collections_task_result.txt"));
            // Сортировка строк в обратном порядке с последующим выводом
            Collections.reverse(linesFromFile);
            pw.println(linesFromFile);
            pw.close();
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
    }
}

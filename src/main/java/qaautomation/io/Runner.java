package qaautomation.io;

//Реализовать программу которая будет получать в качестве аргумента командной строки путь к директории, например "D:/movies".
// Записать в текстовый файл структуру папок и файлов в виде, похожем на выполнение программы tree /F.
//Если в качестве параметра в программу передается не путь к директории, а путь к txt файлу по образцу выше -
// прочитать файл и вывести в консоль следующие данные:
//Количество папок
//Количество файлов
//Среднее количество файлов в папке
//Среднюю длинну названия файла

import java.io.*;
import java.util.Objects;

public class Runner {
    public static void main(String[] args) throws IOException {
        File input = new File(args[0]);
        File file = new File("src/main/resources/files_and_folders.txt");
        int directoryCounter = 0;
        int filesCounter = 0;
        int sumOfLengths = 0;
        int filesInFolders = 0;


        if (input.isDirectory()) {
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            byte numberOfFile = 1;
            for (File f : Objects.requireNonNull(input.listFiles())) {
                if (f.isDirectory()) {
                    pw.println(numberOfFile + ") " + f + " (directory)");
                    directoryCounter++;
                    for(File g : Objects.requireNonNull(f.listFiles())) {
                        if(g.isFile()) {
                            filesInFolders++;
                        }
                    }
                } else if (f.isFile()) {
                    pw.println(numberOfFile + ") " + f + " (file)");
                    sumOfLengths = sumOfLengths + f.getName().length();
                    filesCounter++;
                }
                numberOfFile++;
            }
            pw.println();
            pw.println("Number of folders: " + directoryCounter);
            pw.println("Number of files: " + filesCounter);
            pw.println("The average number of files in a folder: " + filesInFolders/ directoryCounter);
            pw.println("The average length of file name: " + sumOfLengths / filesCounter);
            pw.close();
            System.out.println();
            System.out.println("Structure is written to file.");

        } else if (input.getAbsolutePath().equals(file.getAbsolutePath())) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        else {
            System.out.println("Please, enter existing directory");
        }
    }
}

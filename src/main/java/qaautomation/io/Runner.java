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

public class Runner {
    static int directoryCounter = 0;
    static int fileCounter = 0;
    static int sumOfFilesLengths = 0;
    static PrintWriter pw;

    public static void main(String[] args)  {
        File filesAndFoldersTxt = new File("src/main/resources/files_and_folders.txt");

        String inputString = args[0];
        File input = new File(inputString);
        if (!input.exists()) {
            System.out.println("Not found " + inputString);
        }
        else if (input.getAbsolutePath().equals(filesAndFoldersTxt.getAbsolutePath())) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(filesAndFoldersTxt));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (input.isDirectory()) {
            try {
                pw = new PrintWriter("src/main/resources/files_and_folders.txt");
                list(input);
                pw.println();

                pw.println("Number of folders: " + directoryCounter);
                pw.println("Number of files: " + fileCounter);
                pw.println("Average number of files in folder: " + fileCounter/directoryCounter);
                pw.println("Average length of file: " + sumOfFilesLengths/fileCounter);
                System.out.println("Structure is written to file");
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                pw.close();
            }
        }
        else {
            System.out.println("This is not a directory!");
        }
    }

    static void list(File dir) throws IOException {
        pw.println(dir.toString() + " (directory)");
        int number = 1;
        for(File fileFromList : dir.listFiles()) {
            if (fileFromList.isDirectory()) {
                list(fileFromList);
                directoryCounter++;
            }

            else if (fileFromList.isFile()) {
                pw.println("    " + number + ")" + fileFromList.getName() + " (file)");
                fileCounter++;
                sumOfFilesLengths = sumOfFilesLengths + fileFromList.toString().length();
                number++;
            }
        }
    }
}
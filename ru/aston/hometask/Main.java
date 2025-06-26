package aston.hometask;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Введите путь к файлу:");
        String filePath = scanner.nextLine();

        System.out.println("Введите текст для записи в файл:");
        String content = scanner.nextLine();

        try {
            FileReadWrite.writeToFile(filePath, content);
            System.out.println(FileReadWrite.readFromFile(filePath));
        } catch (MyIOException e) {
            System.err.println(e.getMessage());
            if (e.getCause() != null) {
                System.err.println("Причина: " + e.getCause().getMessage());
            }
        } finally {
            scanner.close();
        }
    }
}
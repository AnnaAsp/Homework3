package aston.hometask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileReadWrite {
    public static void writeToFile(String filePath, String content) throws MyIOException {
        try {
            Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            throw new MyIOException("Произошла ошибка при работе с файлом.", e);
        }
    }

    public static String readFromFile(String filePath) throws MyIOException {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            return new String(bytes);
        } catch (IOException e) {
            throw new MyIOException("Произошла ошибка при работе с файлом.", e);
        }
    }
}

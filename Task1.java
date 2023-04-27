/* Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {

    public static void main(String[] args) {
        try {
            System.out.print(getFileSize(new File("333")));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.print(div(10, 0));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            outputValue();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static long getFileSize(File file) throws IOException {
        if (!file.exists()) {
            throw new IOException("Файл не существует");
        }
        return file.length();
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }

    public static void outputValue() {
        try {
            int[] array = new int[10];
            System.out.print(array[1000]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Индекс массива выходит за пределы массива");
        }
    }
}
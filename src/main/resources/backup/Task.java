package Lesson5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        writeToFileInt(array);   // Записали в файл массив int
        writeToFileString(writeZero(array));  // Записали в файл массив String (разделители чисел - 0)
        int[] arr = readFile("src/main/resources/test.txt");
        for (int val : arr) {
            System.out.println(val);  // Вывод считанного из файла массива int
        }
        System.out.println(makeString("src/main/resources/text2.txt")); // Вывод большого текста из файла, считанного из буфера
        writeFile("src/main/resources/text2.txt", 'a'); //Запись в файл new_text2.txt текста из файла text2.txt
                                                                          // с заменой символа 'a' на пробел
    }
    public static void writeToFileInt(int[] arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/resources/test.txt")) {
            fileWriter.write(Arrays.toString(arr));
        }
    }
    public static void writeToFileString(String arr) throws IOException {
        try (FileWriter fileWriter = new FileWriter("src/main/resources/test.txt")) {
            fileWriter.write(arr);
        }
    }
    public static String writeZero(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append("0");
        }
        sb.append(arr[arr.length - 1]);
        return sb.toString();
    }
    public static int[] readFile(String path) throws IOException {
        ArrayList<Integer> array = new ArrayList<>();
        try (FileReader reader = new FileReader(path)) {
            int n;
            boolean flag = true;
            while ((n = reader.read()) != -1) {
                char temp = (char) n;
                if (temp == '0' && flag)
                    flag = false;
                else {
                    flag = true;
                    try {
                        array.add(Integer.parseInt(String.valueOf(temp)));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        int[] result = new int[array.size()];
        int index = 0;
        for (Integer integer : array) {
            result[index++] = integer;
        }
        return result;
    }
    public static String makeString(String path) throws IOException {
        try (BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path))) {
            return new String(stream.readAllBytes());
        }
    }
    public static void writeFile(String path, char exchangeChar) throws IOException {
        String string = makeString(path);
        string = string.replaceAll(String.valueOf(exchangeChar), " ");
        try (FileWriter writer = new FileWriter("src/main/resources/new_text2.txt")) {
            writer.write(string);
        }
    }
}

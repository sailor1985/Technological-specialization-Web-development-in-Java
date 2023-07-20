package Intermediate_certification_programmer.DZ2;

import java.util.Arrays;
public class Task3 {
    public static void shiftArray(int[] arr, int n) {
        int length = arr.length;
        int[] shiftedArr = new int[length];

        // Вычисляем адекватное значение сдвига
        n = n % length;

        // Сдвигаем элементы на n позиций
        for (int i = 0; i < length; i++) {
            int newPosition = (i + n) % length;
            shiftedArr[newPosition] = arr[i];
        }

        // Копируем сдвинутые элементы обратно в исходный массив
        System.arraycopy(shiftedArr, 0, arr, 0, length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        System.out.println("Исходный массив: " + Arrays.toString(arr));
        shiftArray(arr, n);
        System.out.println("Сдвинутый массив: " + Arrays.toString(arr));
    }
}

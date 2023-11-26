package Java_Junior.DZ1;

import java.util.Arrays;
import java.util.List;

/*
Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

       double averageOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Среднее значение всех четных чисел в списке: " + averageOfEvenNumbers);
        //System.out.println("Среднее значение всех четных чисел в списке: " +
                //averageValueEvenNumbers(numbers));
    }

    public static int averageValueEvenNumbers(List<Integer> list) {
        int sum = 0;
        int counter = 0;
        for (int aver: list) {
            if (aver % 2 == 0) {
                assert false;
                sum += aver;
                counter++;
            }
        }
        return counter > 0 ?  sum / counter : 0;
    }




}

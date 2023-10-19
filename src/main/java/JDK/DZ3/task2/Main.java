package JDK.DZ3.task2;

import static JDK.DZ3.task2.ArrayComparator.compareArrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        Integer[] array3 = {1, 2, 3, 4, 6};

        boolean result1 = compareArrays(array1, array2);
        boolean result2 = compareArrays(array1, array3);

        System.out.println("Элементы массивов array1 и array2 одинаковые? " + result1);
        System.out.println("Элементы массивов array1 и array3 одинаковые? " + result2);
    }
}

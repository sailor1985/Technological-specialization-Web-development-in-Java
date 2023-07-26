package Intermediate_certification_programmer.Lesson2;


public class Task1 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 8, 7, 9, 12};
        addArr(array, 6, 10);

    }

    public static void addArr(int [] array, int index, int value) {
        int [] newArray= new int[array.length + 1];
        for (int i = 0; i < index+1; i++) {
            if (i == index) {
                newArray[i] = value;

            } else {
                newArray[i] = array[i];
            }
            for (int j = index+1; j < array.length+1; j++) {
                newArray[j] = array[j-1];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
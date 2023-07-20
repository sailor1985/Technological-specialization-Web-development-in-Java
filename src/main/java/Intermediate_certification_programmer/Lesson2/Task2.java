package Intermediate_certification_programmer.Lesson2;
public class Task2 {
        public static void main(String[] args) {
            int[] array = {10,5,19,2,35,4,68,2,2,0,0};
            sortArray(array);
        }
        public static void sortArray (int[] array){
            int minValue = 0;
            int maxValue = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
                if (array[i] < minValue){
                    minValue = array[i];
                }
            }
            int[] countArray = new int[maxValue+1];
            for (int j : array) {
                if (countArray[j] == 0) {
                    countArray[j] = 1;
                } else {
                    countArray[j] = countArray[j] + 1;
                }

            }
            for (int j : countArray) {
                System.out.print(j + ", ");
            }
        }
    }

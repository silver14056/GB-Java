package seminar5;

import java.util.Arrays;

class MergeSort {
    public static void merge(int[] left, int[] right, int[] result) {
        // Введите свое решение ниже
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] array) {
        // Введите свое решение ниже
        if (array.length <= 1) {
            return;
        }
        int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
        int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }
}


// Не удаляйте и не меняйте метод Main!
public class dz4 {
    public static void main(String[] args) {
        int[] initArray;
        if (args.length == 0) {
            initArray = new int[]{38, 27, 43, 3, 9, 82, 10};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        MergeSort.mergeSort(initArray);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}

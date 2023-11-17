package practise;

import java.util.Arrays;

public class SortedSquaredArray {

    public static int[] sortedSquaredArray(int[] array) {
        int[] result = new int[array.length];

        int left = 0;
        int right = array.length - 1;
        int index = array.length - 1;

        while (left <= right) {
            int leftSquare = array[left] * array[left];
            int rightSquare = array[right] * array[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 9, 4, 5, 6};

        int[] squaredArray = sortedSquaredArray(array);

        System.out.println("Sorted Squared Array: " + Arrays.toString(squaredArray));
    }
}

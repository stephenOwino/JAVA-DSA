import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    static void main() {
//        The Array Challenge
//        Create a program using arrays that sorts a list of integers in descending order.
//        Descending order means from highest value to lowest.
//
//        In other words, if the array has the values:
//        50, 25, 80, 5, 15
//
//        Your program should return an array with the values in descending order:
//        80, 50, 25, 15, 5.
//
//        Requirements:
//
//        First, create an array of randomly generated integers.
//
//        Print the array before sorting.
//
//                Sort the array in descending order.
//
//                Print the array after sorting.
//
//        You may either:
//
//        Create a new sorted array, or
//
//        Sort the existing array directly.

        //WE CALL IT HERE IN MAIN

        int[] randomArrays = randomArrays(5);
        //before sorting
        System.out.println("Before sorting " + Arrays.toString(randomArrays));

        //after sorting
        Arrays.sort(randomArrays);
        System.out.println("After sorting " + Arrays.toString(randomArrays));

        int[] sortedArrays = sortIntegers(new int[] {7, 30 ,35});
        System.out.println(Arrays.toString(sortedArrays));
    }
    private static int[] randomArrays(int len){
        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++){
            newArray[i] = random.nextInt(100);

        }

        return newArray;
    }
    private static int[] sortIntegers(int[] array){
        IO.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array , array.length);

        //reverse
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++){
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    IO.println("----------->" + Arrays.toString(sortedArray));
                }

            }
            IO.println("---->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}

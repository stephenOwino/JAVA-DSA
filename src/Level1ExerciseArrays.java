import java.util.Arrays;

public class Level1ExerciseArrays {
    static void main() {
//        LEVEL 1 – Basics (Must master)
//
//        Create an array of 5 integers and print all elements.
//
//                Find the sum of all elements in an array.
//
//        Find the largest number in an array.
//
//                Find the smallest number in an array.
//
//        Count how many numbers are even and odd.
//
//👉

        int[] myArrays = {1 ,2 , 3 , 4 , 5};
        for (int arr : myArrays){
            System.out.println(arr);
        }

        sumOfElements();
        findLargestNum();

    }
    //Find the sum of all elements in an array.
    private static void sumOfElements(){
        int[] myArrays = {1 ,2 , 3 , 4 , 5};
        int sum = 0;
        for (int i = 0;  i < myArrays.length; i++){
            sum = sum + myArrays[i];
        }
        System.out.println("sum = " + sum);
    }
    //Find the largest number in an array.
    private static void findLargestNum(){
        int[] largestNum = {5, 6 ,3 ,89 , 56 , 45};
        int largest = largestNum[0];
        for (int i = 1; i < largestNum.length; i++){
            if (largestNum[i] > largest){
                largest = largestNum[i];
            }
        }
        System.out.println("largest number is " + largest);
    }


}


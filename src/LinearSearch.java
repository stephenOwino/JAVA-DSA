public class LinearSearch {
    static void main() {
        //searching a value in an array using linear search

        int[] values = {2, 3, 4, 6, 8, 9 , 20, 33};
        int targetValue = 2;

       int result =  linearSearch(values,targetValue);
       if (result != -1)
        System.out.println("Target value is at index : " + result);
       else {
           System.out.println("target value not found!");
       }


    }
    private static int linearSearch(int[] values, int target){
        for (int i = 0; i < values.length; i++){
            if (values[i] == target){
                return i;
            }
        }
        return -1;
    }
}

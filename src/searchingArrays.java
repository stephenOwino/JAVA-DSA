import java.util.Arrays;

public class searchingArrays {

    static void main() {
        String[] sArray = {"Stephen", "Cairo", "Joyce", "Betty", "Gabriel"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Betty") >= 0) {
            System.out.println("Found Betty In The List!");

        }
        //comparing if arrays are equal!
        int[] s1 = {1, 2, 3, 4, 5, 6};
        int[] s2 = {1, 2, 3, 4, 5, 6};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Both arrays are equal!");
        }else{
                System.out.println("The above arrays are not equal!");
            }
        }
    }


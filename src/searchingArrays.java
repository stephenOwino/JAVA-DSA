import java.util.Arrays;

public class searchingArrays {

    static void main() {
        String[] sArray = {"Stephen" , "Cairo" , "Joyce" , "Betty" , "Gabriel"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Betty") >=0 ){
            System.out.println("Found Betty In The List!");

        }
    }
}

import java.util.Arrays;
    void main() {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);

        for (int[] outer : array2){
            System.out.println(Arrays.toString(outer));
        }
        for (int i = 0; i < array2.length; i++){
            var innerArray = array2[i];
            for (int j = 0; j < array2.length; j++){
                System.out.print(array2[i][j]);
            }
        }
    }


void main() {

    int[] randomArr = getRandomArray(20);
    IO.println(Arrays.toString(randomArr));
    Arrays.sort(randomArr);
    IO.println(Arrays.toString(randomArr));

    int[] secondArray = new int[10];
    IO.println(Arrays.toString(secondArray));
    Arrays.fill(secondArray,5);
    IO.println(Arrays.toString(secondArray));


    int[] thirdArray = getRandomArray(10);
    IO.println(Arrays.toString(thirdArray));

    int[] forthArray = Arrays.copyOf(thirdArray, thirdArray.length);
    IO.println(Arrays.toString(forthArray));

    Arrays.sort(forthArray);
    IO.println(Arrays.toString(thirdArray));
    IO.println(Arrays.toString(forthArray));

    int[] smallerArray = Arrays.copyOf(thirdArray, 5);
    IO.println(Arrays.toString(smallerArray));
    }

    private static int[] getRandomArray(int len){
    Random randomArray = new Random();
    int[] newInt = new int[len];
    for (int i = 0; i < len; i++) {
        newInt[i] = randomArray.nextInt(100);

    }
        return newInt;

    }


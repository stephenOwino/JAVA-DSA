//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    int [] myIntVar = new int[10];
//    myIntVar[0] = 45;
//    IO.println("at 0 we have " + myIntVar[0]);
//
//    int[] oneTen = {1,2,3,4,5,6,7,8,9,10};
//    IO.println("at index position 4,the value is " + oneTen[4]);
//    int arrayLength = oneTen.length;
//    for (int k = 0; k <= arrayLength; k++) {
//        System.out.println(k);


        int[] newArray;
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;

        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        //enhanced for loop
    for (int element : newArray){
        System.out.print(element + " ");
    }
    System.out.println(Arrays.toString(newArray));

    //array of objects
    Object[] objects = new Object[3];
    objects[0] = "Stephen";
    objects[1] = new StringBuilder("Stephen");


    //CALLING ENUM

    DayOfTheWeek weekDay = DayOfTheWeek.TUE;
    System.out.println(weekDay);

    for (int i = 0; i < 10; i++) {
        weekDay = getRandomDay();


        System.out.printf("Name is %s, ordinal value = %d%n",
                weekDay.name(), weekDay.ordinal());

        if (weekDay == DayOfTheWeek.FRI){
            System.out.println("Found Friday!!!");
        }
    }
    }
    public static DayOfTheWeek getRandomDay(){
    int randomInteger = new Random().nextInt(7);
    var allDays = DayOfTheWeek.values();
    return allDays[randomInteger];


    }



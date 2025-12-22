import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

    public static final Scanner scanner = new Scanner(System.in);

    static void main() {
        /*
         * The ArrayList Challenge
         *
         * The goal is to create an interactive console program
         * that displays a menu of options and performs actions
         * based on the user's choice.
         *
         * Available actions:
         *
         * 0 - Shutdown the program
         * 1 - Add item(s) to the list (comma-delimited list)
         * 2 - Remove item(s) from the list (comma-delimited list)
         *
         * The program should prompt the user with:
         * "Enter a number for which action you want to do:"
         *
         * Use the Scanner class to read the user's menu choice
         * (0, 1, or 2) and process the input accordingly.
         *
         * ---------------------------------------------------
         * Requirements:
         *
         * - The list represents a grocery list.
         * - The grocery list must be implemented using an ArrayList.
         *
         * - You must use ArrayList methods to:
         *   - Add items to the list
         *   - Remove items from the list
         *   - Check whether an item already exists in the list
         *   - Print the list
         *
         * - The list must be printed in alphabetical order
         *   after every operation (add or remove).
         *
         * - Duplicate items must NOT be allowed in the list.
         *
         */

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }
    private static void addItems(ArrayList<String>groceries){
        System.out.println("Add Item(s) [Separate Items by comma]:");
        String[] items = scanner.nextLine().split(",");
        groceries.addAll(List.of(items));
    }
    private static void printActions(){

        String textBlock = """
                Available actions:
             
                0 - Shutdown the program
                1 - Add item(s) to the list (comma-delimited list)
                2 - Remove item(s) from the list (comma-delimited list)
                Enter a number for which action you want to do:""";

        System.out.println(textBlock + " ");
    }
}

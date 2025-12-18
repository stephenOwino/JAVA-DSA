import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    static void main() {

        String[] items = {"apples" , "banana" , "guavas" , "oranges"};
        List<String> list = List.of(items);
        System.out.println(list);

//        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("eggs");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles" , "bread", "cheese")
        );
        groceries.addAll(nextList);
        System.out.println(nextList);
        System.out.println(groceries);

        //retrieving arraylist
        System.out.println("Third item is " + groceries.get(2));

        //searching element
        if (groceries.contains("eggs")){
            System.out.println("The List contain eggs");


            //arraylist can contain duplicates
            groceries.add("eggs");
            System.out.println(groceries);
            System.out.println("first " + groceries.indexOf("eggs"));
            System.out.println("last " + groceries.lastIndexOf("eggs"));

            System.out.println(groceries);
            groceries.remove(1);
            System.out.println(groceries);
            groceries.remove("cheese");
            System.out.println(groceries);

            //removing all from the list
            groceries.removeAll(List.of("apples" , "guavas"));
            System.out.println(groceries);

            groceries.retainAll(List.of("eggs" , "pickles" , "bread" , "eggs"));
            System.out.println(groceries);


            //clear everything from the list
            groceries.clear();
            System.out.println(groceries);
            System.out.println("isEmpty = " + groceries.isEmpty());

            //adding again
            groceries.addAll(List.of("bread" , "butter" , "pineapple", "beef"));
            groceries.addAll(Arrays.asList("eggs" , "mustered" , "ham" , "milk"));

            System.out.println(groceries);

            //sorting
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);

            //printing in reverse order
            groceries.sort(Comparator.reverseOrder());
            System.out.println(groceries);

            var groceryAray = groceries.toArray(new String[groceries.size()]);
            System.out.println(Arrays.toString(groceryAray));

        }
    }
}

import java.util.ArrayList;
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
    }
}

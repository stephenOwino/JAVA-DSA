import java.util.Arrays;

    record GroceryItem(String name, String type, int count){
        public GroceryItem(String name) {
            this(name, "DAIRY", 0);
        }

        @Override
        public String toString() {
            return String.format("%d %s in %s", count, name.toUpperCase(), type);
        }
    }
    static void main() {

        //USING ARRAYS
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("milk");
        groceryItems[1] = new GroceryItem("apples" , "PRODUCE", 6);
        groceryItems[2] = new GroceryItem("oranges" , "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryItems));

        //ARRAYLIST
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.add(0 , new GroceryItem("apples" , "PRODUCE" , 6));

        //remove item
        groceryList.remove(1);

        System.out.println(groceryList);



    }


public class Test{
    public static void main(String[] args) {
       
        Item item = new Item("I phone");
        ItemView view = new ItemView();

        ItemController controller = new ItemController(item,view);
        controller.printItemName();


    }
}
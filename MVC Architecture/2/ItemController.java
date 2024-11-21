

public class ItemController{
    private Item item;
    private ItemView itemView;

    public ItemController(Item item, ItemView itemView)
    {
        this.item = item;
        this.itemView = itemView;
    }

   public void printItemName(){
     String name = item.getName();
     itemView.print(name);
   }


}
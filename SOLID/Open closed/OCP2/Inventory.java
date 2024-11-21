
import java.util.ArrayList;

public class Inventory{
    private ArrayList<Goods> goods;

    public Inventory(){
     goods = new ArrayList<>();   
    }


    public void addGood(Goods good){
        goods.add(good);
    }

    public void showInventory(){
        for(Goods good : goods){
            good.show();
        }
    }

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();
        Goods cap = new Cap();
        Goods hat = new Hat();
        Goods watch = new Watch();

        inventory.addGood(cap);
        inventory.addGood(hat);
        inventory.addGood(watch);
        
        inventory.showInventory();
    }
}
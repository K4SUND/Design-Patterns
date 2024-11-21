public class Main{
    public static void main(String[] args){
        // Factory factory = new Factory();
        Factory shop = new Shop();

        Pizza pizza1 = shop.orderPizza("cheese");
        Pizza pizza2 = shop.orderPizza("onion");
    }
}
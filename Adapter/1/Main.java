public class Main{
    public static void main(String[] args) {
        //target 
        //Run


        //1. Fish kenek hdnw
        Fish fish = new GoldFish();
        Dog fishAdapter = new FishAdapter(fish);
        //target 
        //fish.run() -> fish.swim()
        fishAdapter.run();
    }
}
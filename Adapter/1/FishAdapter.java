public class FishAdapter implements Dog{


    //composition
    private Fish fish;

    public FishAdapter(Fish fish){
        this.fish = fish;
    }

    @Override
    public void eat() {
        fish.eat();
    }

    @Override
    public void run() {
        fish.swim();
    }   

}
public class OnionPizza extends Pizza{

    private String name;

    public OnionPizza(){
        name = "Onion Pizza";
    }
    @Override
    public void prepare() {
       System.out.println("Preparing " + name);
    }
    
}
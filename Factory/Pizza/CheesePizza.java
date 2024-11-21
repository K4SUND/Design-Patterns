public class CheesePizza extends Pizza{

    private String name;

    public  CheesePizza(){
        name = "Cheese Pizza";
    }

    @Override
    public void prepare() {
       System.out.println("Preparing " + name);
    }
    
}
public class Decaf implements Bevarage{

    private int price;
    private String description;

    public Decaf(){
        price = 100;
        description = "Decaf";
    }

    @Override
    public String description() {
       
        // System.out.println(description);
        return description;

    }

    @Override
    public int price() {
       return price;
    }

}
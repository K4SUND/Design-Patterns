public class Espresso implements Bevarage{

    private int price;
    private  String description;

    public Espresso(){
        price = 150;
        description = "Espresso";
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
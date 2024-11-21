public class Apple implements Phone{

    private int  price;
    private String description; 

    //constructor
    public Apple(){
        price = 100;
        description = "Only phone";
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public String description() {
        return description;
    }

}
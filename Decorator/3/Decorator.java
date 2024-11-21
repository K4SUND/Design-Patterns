public abstract class Decorator implements Phone{
    
    //instance
    protected Phone phone;

    //constructor
    public Decorator(Phone phone){
        this.phone = phone;
    } 

    //phone eke details gnnw

    @Override
    public int price()
    { 
        int prev = phone.price();
      
        return prev;

    }

    @Override
    public String description()
    {
        String prev = phone.description();
       
        return prev;
    }

    public abstract int decoratePrice();
    public abstract String decorateDescription();
   
    
}
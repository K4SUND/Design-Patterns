public class AddMilk extends  Decorations{

    //constructor
    public AddMilk(Bevarage bevarage){
        super(bevarage);
    }

   @Override
    public String description() {        
       String prev = bevarage.description(); //super class eke function ek
       String now = prev+" Added Milk";
       return now;
        
    }

    @Override
    public int price() {             
       int prev = bevarage.price();   //super class eke funciton ek
       int now = prev+100;
       return now;

    }


   
}
public class AddMocha extends  Decorations{

    //constructor
    public AddMocha(Bevarage bevarage){
        super(bevarage);
    }
    @Override
    public String description() {        
       String prev = bevarage.description();
       String now = prev+" Added Mocha";
       return now;
        
    }

    @Override
    public int price() {             
       int prev = bevarage.price();
       int now = prev+50;
       return now;

    }


   
}
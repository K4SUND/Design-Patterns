public abstract class Decorations implements Bevarage{
   
   //instance
   protected  Bevarage bevarage;

   //constructor
   public Decorations(Bevarage bevarage) {
       this.bevarage = bevarage;
   }

    @Override
    public String description() {        
        return bevarage.description();
        //meka connect wenne kelinm concrete class wlt
        //ude constructor ek bluwm hdt terenw
    }

    @Override
    public int price() {             
       return bevarage.price();

    }

    

    
}
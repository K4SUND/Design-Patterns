public class Main{


    //this is design for ducks
   private static void testDuck(Duck duck)
    {
    System.out.println("This is working only ducks");
    duck.quack();
    }
 

public static void main(String[] args) {
    
    //duck
    Duck duck = new MallardDuck();
    // duck.quack();

    //turkey
    Turkey turkey = new WildTurkey();
    // turkey.gobble();

  /*  
    //target
    //turkey Adapter
    //turkey.quack --> turkey.gobble

    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    turkeyAdapter.quack();

    */

   //look testDuck method working
   //1. duck
   testDuck(duck);
    //2.turkey
    //    testDuck(turkey);  //incompatible types
    // we need adapter to do this

    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    testDuck(turkeyAdapter);



}

}
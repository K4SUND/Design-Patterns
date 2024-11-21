public class Test{
 public static void main(String[] args) {

    //normal bevarage
    Bevarage decaf = new Decaf();
    System.out.println(decaf.description());
    System.out.println(decaf.price());

    Bevarage espresso = new Espresso();
    System.out.println(espresso.description());
    System.out.println(espresso.price());

    //add milk
    //beverage type wenne interface eken implement nisa
    Bevarage decafWithMilk = new AddMilk(decaf);
    System.out.println(decafWithMilk.description()); //decoratuion eka athule tyn function ek


    //add mocha to espresso
    Bevarage espressoWithMocha = new AddMocha(espresso);
    System.out.println(espressoWithMocha.description());



    //add mocha 
    // decorator = new AddMocha(decaf);
    // decorator.decorate();


     
 }


}

public class Test{

    public static void testDuck(Duck duck)
    {
        duck.quack();
    }
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        testDuck(duck);

        //incompatible
        //need adapter
        // testDuck(turkey);

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);




    }
}
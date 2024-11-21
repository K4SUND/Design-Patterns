public class Test{
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        Turkey turkey = new MallardTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        duck.quack();
        turkey.gobble();
        turkeyAdapter.quack();
    }
}
public class Test{
    public static void main(String[] args) {
     
        //strategy A
        Strategy strategyA = new StrategyA();
        //strategy B
        Strategy strategyB = new StrategyB();
        
        //context
        Context context = new Context();
        context.setStrategy(strategyA);
        context.performStrategy();

        context.setStrategy(strategyB);
        context.performStrategy();


        context.setStrategy1("A");
        context.performStrategy();

        context.setStrategy1("B");
        context.performStrategy();
     
    }
}

public class Context{
    private  Strategy strategy;

    //function to set strategy
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy1(String name){
        if(name.equals("A")){
            this.strategy = new StrategyA();
        }
        else if(name.equals("B")){
            this.strategy = new StrategyB();
        }
        else{
            System.out.println("Invalid strategy");
        }
    }

    public void performStrategy(){
        strategy.doOperation();
    }
}
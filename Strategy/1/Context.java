public class Context{
    private Strategy strategy;

    // public Context(Strategy strategy){
    //     this.strategy = strategy;
    // }

    public void setStragy(Strategy strategy){
        this.strategy = strategy;
    }


    //
    public void performSort(){
        strategy.doOperation();
    }

}
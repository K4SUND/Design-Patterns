public class TurnOn implements Command {

    //instance
    private Light light;

    public TurnOn(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
       System.err.println("Turn On");
    }

}
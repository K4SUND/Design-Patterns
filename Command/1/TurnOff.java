public class TurnOff implements Command{

     //instance
    private Light light;

    public TurnOff(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turn Off");
    }

}
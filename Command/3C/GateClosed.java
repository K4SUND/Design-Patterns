public class GateClosed implements Command{
    private Gate gate;

    public  GateClosed(Gate gate){
        this.gate = gate;
    }
    @Override
    public void execute() {
        gate.close();
    }

}
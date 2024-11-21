public class GateOpen implements Command{

    private Gate gate;

    public GateOpen(Gate gate){
        this.gate = gate;
    }
    @Override
    public void execute() {
        gate.open();
    }

}
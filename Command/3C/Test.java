public class Test{
    public static void main(String[] args) {
        //Gate
        Gate gate = new Gate();
        //remote contorller
        RemoteController remoteController = new RemoteController();
        //commands
        Command gateOpenCommand = new GateOpen(gate);
        Command gateCloseCommand = new GateClosed(gate);

        //open the gate
        remoteController.setCommand(gateOpenCommand);
        remoteController.pressButton();

        //close the gate 
        remoteController.setCommand(gateCloseCommand);
        remoteController.pressButton();
    }
}
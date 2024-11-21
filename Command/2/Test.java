public class Test{
    public static void main(String[] args) {
        
        //light
        Light light = new Light();

        //light on command
        Command lightOnCommand = new LightOnCommand(light);
        
         //remote controller
        RemoteController remoteController = new RemoteController();
        
      

       
        remoteController.setCommand(lightOnCommand);
        remoteController.pressButton();

    }
}
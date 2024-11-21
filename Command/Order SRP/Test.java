public class Test{
    public static void main(String[] args) {
        
        //order
        Order order = new Order();

        //commands
        Command placeOrder = new PlaceOrder(order);
        Command UpdateOrder = new UpdateOrder(order);
        Command CancelOrder = new CancelOrder(order);



        //Remote Contoller
        RemoteController remoteController = new RemoteController();   

        //set command
        //place order
        remoteController.setCommand(placeOrder);
        remoteController.pressButton();

        //update order
        remoteController.setCommand(UpdateOrder);
        remoteController.pressButton();

        //cancel order
        remoteController.setCommand(CancelOrder);
        remoteController.pressButton(); 
    }
}
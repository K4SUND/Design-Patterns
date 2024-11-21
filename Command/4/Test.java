public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        Controller controller = new Controller();

        Command command = new PlaceOrder(order);
        controller.setCommand(command);
        controller.executeCommand();
    }
}
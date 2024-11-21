
//one command---> one class ---> single responsibility 
public class PlaceOrder implements Command {
    Order order;

    public PlaceOrder(Order order){
        this.order = order;
    }
    @Override
    public void execute() {
        order.PlaceOrder();
    }

}
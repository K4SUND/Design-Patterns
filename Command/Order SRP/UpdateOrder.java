public class UpdateOrder implements Command{
    Order order;

    public UpdateOrder(Order order){
        this.order = order;
    }
    @Override
    public void execute() {
        order.UpdateOrder();
    }

}
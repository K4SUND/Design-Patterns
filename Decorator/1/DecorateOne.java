public class DecorateOne extends Decorator{

//constructor
    public DecorateOne(Shape shape){
        super(shape);
    }
    @Override
    public void decorate() {
      
        System.out.println("Red Shape");
    }

}
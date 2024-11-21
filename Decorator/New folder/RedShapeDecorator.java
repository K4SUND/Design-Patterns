public class RedShapeDecorator extends Decorator {
    
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }
    @Override
    public void decorate() {
        System.out.println("Red Shape");
    }

    @Override
    public void draw() {
       decoratedShape.draw();
       decorate();
    }
    
}
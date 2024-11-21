public class RedBorder extends Decorator{

    //contructor
    public RedBorder(Shape decoratedShape){
        super(decoratedShape) ;
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        drawBorder();
    }

    @Override
    public void drawBorder() {
        System.out.println("Border Color: Red");

    }

   
}
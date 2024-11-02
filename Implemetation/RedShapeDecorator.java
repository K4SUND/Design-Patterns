public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }


    //here decorations are added
    private void setRedBorder(Shape decoredShape)
    {
        System.out.println("Border Color : Red");
    }
   
   
       
    
}
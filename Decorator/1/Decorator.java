

public abstract  class Decorator implements Shape {

    protected Shape decoratedShape;

    //constructor
    public Decorator(Shape shape)
    {
        decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        decorate();

    }

    public abstract void decorate();

}
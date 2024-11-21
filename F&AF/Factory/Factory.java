public class Factory{
    public Shape getShape(String shapeType){
        if(shapeType.equals("Circle"))
        {
            return new Circle();

        }
        else if(shapeType.equals("Square"))
        {
            return new Square();
        }
        else
        {
            return null;
        }
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape circle = factory.getShape("Circle");
        Shape Square = factory.getShape("Square");

    }
}
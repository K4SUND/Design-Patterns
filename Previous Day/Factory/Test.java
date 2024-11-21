public class Test{
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Product square = shapeFactory.getShape("Square");
        Product circle = shapeFactory.getShape("Circle");
        

    }
}
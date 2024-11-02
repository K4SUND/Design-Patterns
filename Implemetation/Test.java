public class Test{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
    
        // Without decoration
    
        // circle.draw();
        // rectangle.draw();


        // With decoration
        Shape redCircle = new RedShapeDecorator(circle);
        circle.draw();
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(rectangle);
        rectangle.draw();
        redRectangle.draw();

    }
}
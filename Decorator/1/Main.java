public class Main{
    public static void main(String[] args) {
        
        Shape shape = new Circle();
        shape.draw();

        //red shape
        Shape redCircle = new DecorateOne(shape);
        redCircle.draw();


    }
}
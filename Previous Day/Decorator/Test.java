public class Test{
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape redCircle = new RedBorder(circle);
        redCircle.draw();
    }
}
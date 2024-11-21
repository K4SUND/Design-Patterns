public class Main{
    public static void main(String[] args) {
        //create objects
        //Rectangle
        //Circle

        /*
        Shape rectangle = new Rectangle();
        System.out.println(rectangle.draw());

        Shape circle = new Circle();
        System.out.println(circle.draw());

        */
       Factory factory1 = new Factory();
       Shape rectangle = factory1.getShape("Rectangle");
    //    System.out.println(rectangle.draw());
       System.out.println(rectangle);
       Shape new1 = factory1.getShape("Faaa");
       System.out.println(new1);    
       }
}
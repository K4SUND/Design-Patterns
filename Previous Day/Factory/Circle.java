public class Circle implements Product{

    public Circle(){
        System.out.println("Circle is created");
    }
    @Override
    public String produce() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
public class Square implements Product{

    public Square(){
        System.out.println("Square is created");
    }
    @Override
    public String produce() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
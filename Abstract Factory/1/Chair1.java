public class Chair1 implements Chair{
    public Chair1(){
        System.out.println("Chair1 is created");
    }
    @Override
    public void sit() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
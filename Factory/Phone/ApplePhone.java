public class ApplePhone implements Phone{

    public ApplePhone(){
        System.out.println("Apple phone created");
    }

    @Override
    public void description() {
        System.out.println("Apple phone");
    }
    
}
public class SamsungPhone implements Phone{

     public SamsungPhone(){
        System.out.println("Samsung phone created");
    }
    
    @Override
    public void description() {
        System.out.println("Samsung phone");
    }
}
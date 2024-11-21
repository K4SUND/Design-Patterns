public class Test{
    public static void main(String[] args) {
        //create factory
        Factory phoneFactory = new Factory();
        //create Apple phone
        Phone phone1 = phoneFactory.createPhone("Apple");
        //create Samsung phone  
        Phone phone2 = phoneFactory.createPhone("Samsung");
    }
}
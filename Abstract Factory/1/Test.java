public class Test{
    public static void main(String[] args) {
        //factory
        Factory factory = new Factory();
        Table table = factory.createTable();
        Chair chair = factory.createChair();
    }
}
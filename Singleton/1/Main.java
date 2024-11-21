
public class Main{
    public static void main(String[] args) {
      /*
        // SingletonClass singletonClass = new SingletonClass();

        SingletonClass singletonClass = SingletonClass.getInstance();
        // singletonClass.getInfo();

        singletonClass.setInfo("Thimal", 11);
        // singletonClass.getInfo();

        //Assume new object
        SingletonClass singletonClass2 = SingletonClass.getInstance();      
        singletonClass2.getInfo(); //thimal 11  
        */

        //instance
        SingletonClass instance1 = SingletonClass.getInstance();
        instance1.getInfo();
        instance1.setInfo("Ninada", 22);

        SingletonClass instance2 = SingletonClass.getInstance();
        instance2.getInfo();
    }
}
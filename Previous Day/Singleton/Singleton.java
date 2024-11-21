public class Singleton{
    //private static instance
    private static Singleton instance;

    //private constructor
    private Singleton(){
       
    }

    //get instance
    public static  Singleton getInstance(){
        if(instance==null)
        {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }
}
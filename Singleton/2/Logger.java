public class Logger{
    //private static instance
    private static Logger instance;

    //private constructor
    private Logger(){
        
    }

    //public access to get the instance
    //this should not be able to objects(static)
    public static  Logger getInstance(){
        if(instance==null)
        {
            instance = new Logger();
            return instance;
        }

        return instance;
    }

}

public class SingletonClass{

    private String name ;
    private int age ;

    //instance
    private static SingletonClass instance;

    //private constructor
    private SingletonClass(){
        name = "Kasun";
        age = 10;
    }


    //to get object
    //to make object
    public static SingletonClass getInstance(){
        if(instance==null){
            instance = new SingletonClass();
            return instance;

        }
        else{
            return instance;
        }
    }

    //set the information
    public void setInfo(String name, int age){
        this.name = name;
        this.age = age;
    }

    //get the information
    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    




}


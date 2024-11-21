
import java.util.ArrayList;

public class ConcreteSubjectOne implements Subject {
    
    private String state;
    private ArrayList<Observer> observers;


    //constructor
    public ConcreteSubjectOne(){
        state = "No any changes(Initial)";
        observers = new ArrayList<>();

    }
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
       if(observers.isEmpty()){
        System.out.println("No any observers");
        return;
       }
       else{
       for( Observer observer : observers){
           observer.update();
       }
       }
    }

    public void setState(String state)
    {
        this.state = state;
        notifyObservers();  

    }

}
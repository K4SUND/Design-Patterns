
import java.util.ArrayList;

public class SubjectOne  implements Subject{

    private ArrayList<Observer> observers;

    

    public SubjectOne() {
        observers = new ArrayList<>();
    }
    @Override
    public void addObserver(Observer obsever) {
       observers.add(obsever);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }

    //function
    public void changeState(){
        System.out.println("Change State");
        notifyObservers();
    }

}
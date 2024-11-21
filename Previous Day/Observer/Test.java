public class Test{
    public static void main(String[] args) {
        SubjectOne subject = new SubjectOne();
        //observers
        Observer observerOne = new ObserverOne();   
        Observer observerTwo = new ObserverTwo();
        subject.addObserver(observerOne);
        subject.addObserver(observerTwo);
        subject.changeState();
    }
}
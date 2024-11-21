public interface Subject {
    public void addObserver(Observer obsever);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
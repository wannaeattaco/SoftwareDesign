import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObserver(Object changed) {
        for(Observer observer : observers){
            observer.update(changed);
        }
    }
}
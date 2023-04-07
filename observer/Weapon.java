package observer;

import java.util.ArrayList;
import java.util.List;

public class Weapon implements Subject {
    List<Observer> observers;
    String weaponName;

    public Weapon(String weaponName) {
        this.observers = new ArrayList<>();
        this.weaponName = weaponName;
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
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void attack(){
        System.out.println("Weapon " + weaponName + " is attacking");
        notifyObservers("attack");
    }
}

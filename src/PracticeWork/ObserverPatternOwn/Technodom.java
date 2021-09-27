package PracticeWork.ObserverPatternOwn;

import java.util.ArrayList;
import java.util.List;

public class Technodom implements IObservable{
    private List<String> iPhones = new ArrayList<>();
    private List<IObserver> users = new ArrayList<>();

    public void addNewIPhone(String iPhone){
        this.iPhones.add(iPhone);
        notifyUsers();
    }

    public void removeIPhone(String iPhone){
        this.iPhones.remove(iPhone);
        notifyUsers();
    }

    @Override
    public void registerUser(IObserver user) {
        this.users.add(user);
    }

    @Override
    public void deleteUser(IObserver user) {
        this.users.remove(user);
    }

    @Override
    public void notifyUsers() {
        for (IObserver user: users){
            user.update(this.iPhones);
        }
    }
}

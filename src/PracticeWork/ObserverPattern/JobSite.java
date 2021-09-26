package PracticeWork.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements IObservable{
    private List<String> vacancies = new ArrayList<>();
    private List<IObserver> users = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyAllUsers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyAllUsers();
    }

    @Override
    public void registerUser(IObserver user) {
        this.users.add(user);
    }

    @Override
    public void unregisterUser(IObserver user) {
        this.users.remove(user);
    }

    @Override
    public void notifyAllUsers() {
        for (IObserver user: users){
            user.update(this.vacancies);
        }
    }
}

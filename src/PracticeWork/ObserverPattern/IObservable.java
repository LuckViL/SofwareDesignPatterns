package PracticeWork.ObserverPattern;

public interface IObservable {
    void registerUser(IObserver user);
    void unregisterUser(IObserver user);
    void notifyAllUsers();
}

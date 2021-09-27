package PracticeWork.ObserverPatternOwn;

import java.util.List;

public class Client implements IObserver{
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> iPhones) {
        System.out.println("Dear " + this.name + "\n We have some changes: \n" + iPhones + "\n");
    }
}

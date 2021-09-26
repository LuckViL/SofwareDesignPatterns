package PracticeWork.ObserverPattern;

public class Main {

    public static void main(String[] args){
        JobSite hhKz = new JobSite();

        hhKz.addVacancy("Java Junior Developer");
        hhKz.addVacancy("Golang Middle Developer");

        User user1 = new User("Daryn");
        User user2 = new User("Inkarbek");

        hhKz.registerUser(user1);
        hhKz.registerUser(user2);

        hhKz.removeVacancy("Java Junior Developer");
        hhKz.addVacancy("DevOps engineer");

        hhKz.unregisterUser(user1);

        hhKz.addVacancy("Web developer");


    }
}

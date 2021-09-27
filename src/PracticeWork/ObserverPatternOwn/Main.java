package PracticeWork.ObserverPatternOwn;


public class Main {
    public  static void main(String[] args){
        Technodom section5 = new Technodom();
        section5.addNewIPhone("IPhone 13 x25");
        section5.addNewIPhone("IPhone 13 pro x10");

        Client user1 = new Client("Daryn");

        section5.registerUser(user1);

        section5.addNewIPhone("IPhone 13 pro max x20");

        section5.deleteUser(user1);
    }
}

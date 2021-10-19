package Assignment_4.FactoryMethod;

public class Main {
    public static void main(String[] args){
        AssignmentCreator creator = new AbstractFactoryAssignmentCreator();
        Assignment assignment = creator.createAssignment();

        assignment.getContent();
        assignment.getDeadline();
    }
}

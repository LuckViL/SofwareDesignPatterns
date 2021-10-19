package Assignment_4.FactoryMethod;

public class AbstractFactoryAssignmentCreator implements AssignmentCreator{
    @Override
    public Assignment createAssignment() {
        return new AbstractFactoryAssignment();
    }
}

package Assignment_4.FactoryMethod;

public class FactoryMethodAssignmentCreator implements AssignmentCreator{
    @Override
    public Assignment createAssignment() {
        return new FactoryMethodAssignment();
    }
}

package PracticeWork.DecoratorPattern;

public class DeveloperDecorator implements IDeveloper{
    // Dependency injection by constructor
    private IDeveloper developer;

    public DeveloperDecorator(IDeveloper developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}

package PracticeWork.DecoratorPattern;

public class SeniorJavaDeveloperDecorator extends DeveloperDecorator{
    public SeniorJavaDeveloperDecorator(IDeveloper developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}

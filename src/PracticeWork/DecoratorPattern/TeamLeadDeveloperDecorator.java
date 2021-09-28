package PracticeWork.DecoratorPattern;

public class TeamLeadDeveloperDecorator extends DeveloperDecorator{
    public TeamLeadDeveloperDecorator(IDeveloper developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "I'm sending week report. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}

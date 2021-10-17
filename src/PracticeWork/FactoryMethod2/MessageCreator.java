package PracticeWork.FactoryMethod2;

public abstract class MessageCreator {
    public Message getMessage(){
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    protected abstract Message createMessage();
}

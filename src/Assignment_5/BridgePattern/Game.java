package Assignment_5.BridgePattern;

public abstract class Game {
    protected IHeadphone headphone;
    protected IMicrophone microphone;

    public void setMicrophone(IMicrophone microphone) {
        this.microphone = microphone;
    }

    public void setHeadphone(IHeadphone headphone) {
        this.headphone = headphone;
    }

    public abstract void useHeadphone(String game);
    public abstract void useMicrophone();
}

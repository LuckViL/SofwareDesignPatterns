package Assignment_5.AdapterPattern;

public class PNG implements Image{
    @Override
    public void submitImage() {
        System.out.println("Image submitted with type png!");
    }
}

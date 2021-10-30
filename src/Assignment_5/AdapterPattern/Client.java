package Assignment_5.AdapterPattern;

public class Client {
    public void submittingPNGFormatImage(Image image){
        System.out.println("Client submitting png format image.");
        image.submitImage();
    }
}

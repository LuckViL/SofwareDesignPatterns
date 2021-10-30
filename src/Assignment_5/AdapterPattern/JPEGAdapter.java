package Assignment_5.AdapterPattern;

public class JPEGAdapter implements Image{
    JPEG jpeg;

    public JPEGAdapter(JPEG jpeg) {
        this.jpeg = jpeg;
    }

    @Override
    public void submitImage() {
        System.out.println("Converting png file format to jpeg file format...");
        jpeg.submitJPEGFileFormat();
    }
}

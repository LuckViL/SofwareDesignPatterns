package Assignment_5.AdapterPattern;

public class Main {

    public static void main(String[] args){
        Client client = new Client();
        Image png = new PNG();

        client.submittingPNGFormatImage(png);
        System.out.println("------------------------------------");

        JPEG jpeg = new JPEG();
        JPEGAdapter adapter = new JPEGAdapter(jpeg);

        client.submittingPNGFormatImage(adapter);
    }
}

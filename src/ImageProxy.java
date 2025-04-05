public class ImageProxy implements Image {
    private String filename;
    private HighResImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    public void displayThumbnail() {
        System.out.println("Displaying cached thumbnail: " + filename);
    }

    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResImage(filename);
        }
        realImage.displayFullImage();
    }
}
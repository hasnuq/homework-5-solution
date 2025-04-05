public class Demo {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("house1.jpg");
        Image image2 = new ImageProxy("villa2.jpg");

        image1.displayThumbnail();
        image2.displayThumbnail();
        image1.displayFullImage();
        image2.displayFullImage();
    }
}

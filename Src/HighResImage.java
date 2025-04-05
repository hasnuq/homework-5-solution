public class HighResImage implements Image {
    private String filename;

    public HighResImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("[Loading full-resolution image: " + filename + "]");
    }

    public void displayThumbnail() {
        System.out.println("Displaying thumbnail: " + filename);
    }

    public void displayFullImage() {
        System.out.println("Displaying full-resolution image: " + filename);
    }
}
package images;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image with the following name: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image with the following name: " + fileName);
    }
}

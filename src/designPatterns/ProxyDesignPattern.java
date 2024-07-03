package designPatterns;
// Subject interface
interface Image {
    void display();
}

// Real Subject
class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Proxy
class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

// Client
public class ProxyDesignPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("sample.jpg");

        // Image will be loaded only when display() is called
        image.display();

        // Image will not be loaded again
        image.display();
    }
}

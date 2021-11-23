package images;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image cat = new RealImage("cat.jpg"); // creates image obj and loads image
        cat.display(); // displays image

        Image dog = new ProxyImage("dog.jpg"); // creates image obj
        dog.display(); // loads and displays
    }
}

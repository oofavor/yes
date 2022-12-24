import java.awt.*;

abstract public class Bird {

    protected int x, y, size;
    protected Color color;
    private String name;

    public Bird(String birdName) {
        name = birdName;

        color = Color.BLACK;
        size = 20;
    }

    public String getName() {
        return name;
    }

}

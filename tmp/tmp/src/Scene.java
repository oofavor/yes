
import javax.swing.*;
import java.awt.*;

public class Scene extends JFrame {
    public static final int WIDTH = 800;
    public static final int HEIGTH = 800;

    public Scene() {
        setSize(WIDTH, HEIGTH);
        setTitle("Yes");
        setLocation(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawLine(0, 0, 500, 500);
        g.drawOval(40, 40, 170, 170);
    }
}
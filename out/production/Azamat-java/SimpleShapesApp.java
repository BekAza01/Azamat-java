import javax.swing.*;
import java.awt.*;

public class SimpleShapesApp extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Тіктөртбұрыш
        g.drawRect(50, 50, 150, 100);
        g.drawString("Rectangle", 70, 45);

        // Шеңбер
        g.drawOval(250, 50, 100, 100);
        g.drawString("Circle", 270, 45);

        // Түзу
        g.drawLine(50, 200, 200, 200);
        g.drawString("Line", 90, 195);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes");
        frame.add(new SimpleShapesApp());
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


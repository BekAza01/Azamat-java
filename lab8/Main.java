import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();

        int centerX = width / 2;
        int centerY = height / 2;

        // Осьтер
        g2.drawLine(0, centerY, width, centerY);
        g2.drawLine(centerX, 0, centerX, height);

        // k = 0.1 ... 1
        for(double k = 0.1; k <= 1.0; k += 0.1){

            int prevX = 0;
            int prevY = 0;
            boolean first = true;

            for(double x = -10; x <= 10; x += 0.1){

                double y = k * x;

                int drawX = centerX + (int)(x * 30);
                int drawY = centerY - (int)(y * 30);

                if(!first){
                    g2.drawLine(prevX, prevY, drawX, drawY);
                }

                prevX = drawX;
                prevY = drawY;
                first = false;
            }
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("y = kx Graph");

        Main panel = new Main();

        frame.add(panel);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



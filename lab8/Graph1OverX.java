import javax.swing.*;
import java.awt.*;

public class Graph1OverX extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        int cx = w/2;
        int cy = h/2;

        g2.drawLine(0, cy, w, cy);
        g2.drawLine(cx, 0, cx, h);

        int px = 0, py = 0;
        boolean first = true;

        for(double x = -10; x <= 10; x += 0.01){
            if(x == 0) continue; // x=0-де бөлшек анықталмаған
            double y = 1 / x;

            int dx = cx + (int)(x*30);
            int dy = cy - (int)(y*30);

            if(!first){
                g2.drawLine(px, py, dx, dy);
            }

            px = dx;
            py = dy;
            first = false;
        }
    }

    public static void main(String[] args){
        JFrame f = new JFrame("y = 1/x");
        f.add(new Graph1OverX());
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}



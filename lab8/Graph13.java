import javax.swing.*;
import java.awt.*;

public class Graph13 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        int w = getWidth(), h = getHeight();
        int cx = w/2, cy = h/2;

        g2.setColor(Color.LIGHT_GRAY);
        for(int i=0;i<w;i+=30) g2.drawLine(i,0,i,h);
        for(int i=0;i<h;i+=30) g2.drawLine(0,i,w,i);

        g2.setColor(Color.BLACK);
        g2.drawLine(0,cy,w,cy);
        g2.drawLine(cx,0,cx,h);

        g2.setColor(Color.RED);
        int px=0,py=0;
        boolean first=true;
        for(double x=-10;x<=10;x+=0.01){
            double y=(2*x*x + x + 1)/2;

            int dx=cx+(int)(x*20);
            int dy=cy-(int)(y*20);

            if(!first) g2.drawLine(px,py,dx,dy);
            px=dx; py=dy; first=false;
        }
    }

    public static void main(String[] args){
        JFrame f = new JFrame("y = (2x² + x + 1)/2");
        f.add(new Graph13());
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}



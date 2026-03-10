import javax.swing.*;
import java.awt.*;

public class Parabola3x2 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2=(Graphics2D)g;

        int w=getWidth();
        int h=getHeight();

        int cx=w/2;
        int cy=h/2;

        g2.drawLine(0,cy,w,cy);
        g2.drawLine(cx,0,cx,h);

        int px=0,py=0;
        boolean first=true;

        for(double x=-10;x<=10;x+=0.1){

            double y=3*x*x;

            int dx=cx+(int)(x*30);
            int dy=cy-(int)(y*5);

            if(!first){
                g2.drawLine(px,py,dx,dy);
            }

            px=dx;
            py=dy;
            first=false;
        }
    }

    public static void main(String[] args){

        JFrame f=new JFrame("y=3x^2");

        f.add(new Parabola3x2());
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}



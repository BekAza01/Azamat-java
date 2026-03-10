import javax.swing.*;
import java.awt.*;

public class Power5Graph extends JPanel {

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

        for(double x=-3;x<=3;x+=0.01){

            double y=Math.pow(x,5);

            int dx=cx+(int)(x*80);
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

        JFrame f=new JFrame("x^5");

        f.add(new Power5Graph());
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}


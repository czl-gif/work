package pojo;
import pojo.abst;

import javax.swing.*;
import java.awt.*;

public class LineShipe extends abst{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LineShipe() {}
    public LineShipe(int x1_, int y1_, int x2_, int y2_) {
        this.x1 = x1_;
        this.y1 = y1_;
        this.x2 = x2_;
        this.y2 = y2_;
    }
    public void draw(){
        JFrame jf = new JFrame();
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.black);
                graphics.drawLine(x1, y1,x2,y2);
            }
        };
        jf.add(jPanel);
        jf.setVisible(true);
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX1() {
        return x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY1() {
        return y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX2() {
        return x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY2() {
        return y2;
    }
}

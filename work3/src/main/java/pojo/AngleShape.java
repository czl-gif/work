package pojo;

import javax.swing.*;
import java.awt.*;

public class AngleShape extends abst{
    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;
    public AngleShape(){}
    public AngleShape(int x1_, int y1_, int x2_, int y2_, int x3_, int y3_) {
        x1 = x1_;
        x2 = x2_;
        x3 = x3_;
        y1 = y1_;
        y2 = y2_;
        y3 = y3_;
    }

    @Override
    public void draw() {
        JFrame jf = new JFrame();
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.black);
                Polygon polygon = new Polygon();
                polygon.addPoint(x1,y1);
                polygon.addPoint(x2,y2);
                polygon.addPoint(x3,y3);
                graphics.drawPolygon(polygon);
            }
        };
        jf.add(jPanel);
        jf.setVisible(true);
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }
}

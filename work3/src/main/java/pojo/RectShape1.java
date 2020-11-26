package pojo;

import javax.swing.*;
import java.awt.*;

public class RectShape1 extends abst{
    private int x;
    private int y;
    private int width;
    private int height;
    public RectShape1() {}
    public RectShape1(int x_, int y_, int width_, int height_) {
        this.x = x_;
        this.y = y_;
        this.width = width_;
        this.height = height_;
    }

    public void draw() {
        JFrame jf = new JFrame();
        jf.setSize(600,600);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        JPanel jPanel = new JPanel() {
            public void paint(Graphics graphics) {
                graphics.setColor(Color.black);
                graphics.drawRect(x,y,width,height);
                graphics.fillRect(x,y,width,height);
            }
        };
        jf.add(jPanel);
        jf.setVisible(true);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

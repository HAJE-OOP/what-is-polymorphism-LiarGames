package org.haje.ducks;

import java.awt.*;

public abstract class Duck {
    private int x;
    private int y;
    protected int spd;
    protected Color color_body;
    protected Color color_head;
    protected Color color_beak;
    protected Color color_eye;
    protected Color color_highlight;
    protected Color color_wing;

    Duck(int x, int y){
        this.x = x;
        this.y = y;
        this.setColor();
    }

    abstract void setColor();

    public void Move(int x_scale, int y_scale) {
        x += x_scale*spd;
        y += y_scale*spd;
    }

    public void Draw(Graphics2D g2d) {
        // Body
        g2d.setColor(color_body);
        g2d.fillOval(x, y, 120, 80);

        // Head
        g2d.setColor(color_head);
        g2d.fillOval(x + 90, y - 30, 60, 60);

        // Beak
        g2d.setColor(color_beak);
        Polygon beak = new Polygon();
        beak.addPoint(x + 140, y);
        beak.addPoint(x + 160, y - 10);
        beak.addPoint(x + 160, y + 10);
        g2d.fill(beak);

        // Eye
        g2d.setColor(color_eye);
        g2d.fillOval(x + 120, y - 10, 10, 10);

        // Highlight
        g2d.setColor(color_highlight);
        g2d.fillOval(x + 122, y - 8, 5, 5);

        // Wing
        g2d.setColor(color_wing);
        g2d.fillArc(x + 20, y + 20, 60, 40, 0, 180);
    }
}

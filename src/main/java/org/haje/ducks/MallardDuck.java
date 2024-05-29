package org.haje.ducks;

import java.awt.*;

public class MallardDuck extends Duck{
    @Override
    void setColor() {
        this.color_body = new Color(0, 150, 0);
        this.color_head = new Color(0, 100, 0);
        this.color_beak = Color.ORANGE;
        this.color_eye = Color.BLACK;
        this.color_highlight = Color.WHITE;
        this.color_wing = new Color(0, 120, 0);
    }

    public MallardDuck(int x, int y) {
        super(x,y);
        this.spd = 6;
    }
}
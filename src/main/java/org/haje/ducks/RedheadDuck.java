package org.haje.ducks;

import java.awt.*;

public class RedheadDuck extends Duck{
    @Override
    void setColor() {
        this.color_body = new Color(150, 75, 0);
        this.color_head = new Color(180, 0, 0);
        this.color_beak = Color.YELLOW;
        this.color_eye = Color.BLACK;
        this.color_highlight = Color.WHITE;
        this.color_wing = new Color(120, 60, 0);
    }

    public RedheadDuck(int x, int y) {
        super(x,y);
        this.spd = 9;
    }
}
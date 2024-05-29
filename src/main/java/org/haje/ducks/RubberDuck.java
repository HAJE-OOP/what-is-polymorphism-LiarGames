package org.haje.ducks;

import java.awt.*;

public class RubberDuck extends Duck{
    @Override
    void setColor() {
        this.color_body = Color.YELLOW;
        this.color_head = Color.YELLOW;
        this.color_beak = Color.ORANGE;
        this.color_eye = Color.BLACK;
        this.color_highlight = Color.WHITE;
        this.color_wing = new Color(0, 0, 0,0);
    }

    public RubberDuck(int x, int y) {
        super(x,y);
        this.spd = 12;
    }
}
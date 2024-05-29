package org.haje.ducks;

import java.awt.*;

public class DecoyDuck extends Duck{
    @Override
    void setColor() {
        this.color_body = new Color(139, 69, 19);
        this.color_head = new Color(139, 69, 19);
        this.color_beak = Color.BLACK;
        this.color_eye = Color.BLACK;
        this.color_highlight = Color.WHITE;
        this.color_wing = new Color(139, 69, 19);
    }

    public DecoyDuck(int x, int y) {
        super(x,y);
        this.spd = 3;
    }
}
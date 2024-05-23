import javax.swing.*;

public class It_indicator extends Players {
    private int dy;
    private int dx;

    public It_indicator() {
        super();
    }

    public It_indicator(int xV, int yV, int w, int h) {
        super(xV, yV, new ImageIcon("It_indicator.png"), w, h);
        dy = 0;
        dx = 0;
    }

    // Sets the absolute x position
    public void setX(int x1) {
        super.setX(x1);
    }

    // Sets the absolute y position
    public void setY(int y1) {
        super.setY(y1);
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void move() {
        // Update the position based on dx and dy
        setX(getX() + dx);
        setY(getY() + dy);
    }
}

import javax.swing.*;

public class Player1 extends Players {
    private int dy;
    private int dx;

    public Player1() {
        super();
    }

    public Player1(int xV, int yV, int w, int h) {
        super(xV, yV, new ImageIcon("newredcharacter.png"), w, h);
        dy = 0;
        dx = 0;
    }

    public void setX(int x1) {
        super.setX(x1 - super.getX());
    }

    public void setY(int y1) {
        super.setY(y1 - super.getY());
    }

    public void setdy(int c) {
        dy = c;
    }

    public void setdx(int r) {
        dx = r;
    }

    public void move() {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    public boolean collision(Player2 player2) {
        if (this.getX() + getWidth() >= player2.getX() &&
            getX() <= player2.getX() + player2.getWidth() &&
            getY() + getHeight() >= player2.getY() &&
            getY() <= player2.getY() + player2.getHeight()) {
            
            return true;
        }
        return false;
    }

}

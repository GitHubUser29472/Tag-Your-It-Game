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

    public void moveScreenWarp() {
        setX(getX() + dx);
        setY(getY() + dy);
        
        if (getX() + getWidth() < 0) {
            setX(1350);
        } else if (getX() > 1350) {
            setX(-getWidth());
        }

        // Wrap around vertically
        if (getY() + getHeight() < 0) {
            setY(700);
        } else if (getY() > 700) {
            setY(-getHeight());
        }
    }
    public void move() {
        // Move the player
        setX(getX() + dx);
        setY(getY() + dy);

        // Ensure the player stays within the screen boundaries
        if (getX() < 0) {
            setX(0);
        } else if (getX() + getWidth() > 1350) {
            setX(1350 - getWidth());
        }

        if (getY() < 0) {
            setY(0);
        } else if (getY() + getHeight() > 700) {
            setY(700 - getHeight());
        }
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

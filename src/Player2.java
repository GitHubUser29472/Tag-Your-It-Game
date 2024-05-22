import javax.swing.*;

public class Player2 extends Players{
private int dy;
private int dx;
	
		
	
	
	public Player2() 
	{
		super();
	}
	
	
	public Player2(int xV, int yV, int w, int h) {
		super(xV, yV, new ImageIcon("bluecharacter-removebg-preview.png"), w, h);
		dy=0;
		dx=0;
	}
	
	
	
	public void setX(int x1) {
		super.setX(x1-super.getX());
	}
	
	public void setY(int y1) {
	    super.setY(y1 - super.getY());
	}

	
	public void setdy(int c) {
		 dy=c;
	}
	public void setdx(int r) {
		 dx=r;
	}


	public void moveScreenWarp() {
		// TODO Auto-generated method stub
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

	
	
	
	
	
	
	//add boolean for hit by alien missiles
	/*
	public boolean collision(AlienShip p) {
		if(this.getX()+getWidth()>=p.getX()&&
				getX()<=p.getX()+p.getWidth()&&
				getY()+getHeight()>=p.getY()&&
				getY()<=p.getY()+p.getHeight())
				{
				
					return true;
				}
		
		
		return false;
	}
	*/
	
	
}

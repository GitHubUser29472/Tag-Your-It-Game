import javax.swing.*;

public class It_indicator extends Players{
private int dy;
private int dx;
	
		
	
	
	public It_indicator() 
	{
		super();
	}
	
	
	public It_indicator(int xV, int yV, int w, int h) {
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


	public void move() {
		// TODO Auto-generated method stub
		setX(getX() + dx);
		
		setY(getY() + dy);
	}
	
	
	
	
	
	
	
	
	
	
}

import java.awt.Color;

import javax.swing.ImageIcon;

public class It_indicator {
	
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int dy;
	private int dx;
	private Color c;
	private boolean ItOrNah;


	public It_indicator() {
		x=700;
		y=300;
		width=25;
		height=40;
		c=Color.cyan;
ItOrNah=false;
	}

	public It_indicator(int x1, int y1, int w, int h, Color c1) {
		x=x1;
		y=y1;
		width=w;
		height=h;
		c=c1;
		dy=0;
		dx=0;

	}

	
	
	
	
	
	
	
	
	
	public int getX(){
		 return x;
	}
	
	public int getY(){
		 return y;
	}

	public int getWidth() {
		
		return width;
	}

	public int getHeight() {
		
		return height;
	}

	public Color getColor() {
		
		return c;
	}
	
	public void setdy(int c) {
		 dy=c;
	}
	
	public void setdx(int d) {
		 dx=d;
	}



	public void follow(){

				 
		

	}

}

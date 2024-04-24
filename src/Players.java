import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.image.BufferedImage;

public class Players {
	
private int x;
private int y;
private int width;
private int height;
private int dy;
private int dx;
private Color c;
	private int score;


public Players() {
	x=700;
	y=300;
	width=25;
	height=40;
	c=Color.cyan;
	score=0;
}

public Players(int x1, int y1, int w, int h, Color c1) {
	x=x1;
	y=y1;
	width=w;
	height=h;
	c=c1;
	dy=0;
	dx=0;
	score=0;
}


public int getX(){
	 return x;
}
public int getY(){
	 return y;
}

public int getScore(){
	 return score;
}

public void setScore(int scorefromgame) {
	score +=scorefromgame;
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



public void move(){

		
		 y+=dy;
		 x+=dx;
		 if(x+width>1350)
			 x=1350-width;
		 if(x<0)
			 x=0;
		 if(y<0)
			 y=0;
		 if(y>620)
			 y=620;
		 
	

}


}
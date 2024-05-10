import javax.swing.*;

public class Players {
	private int x,y,width, height;
	private ImageIcon pic;
	
	public Players()
	{
		x=0;
		y=0;
		pic = new ImageIcon();
		width = 100;
		height = 100;
	}
	public Players (int xV, int yV, ImageIcon p, int w, int h)
	{
		x=xV;
		y=yV;
		pic=p;
		width=w;
		height=h;
	}

	//add getters and setters
	

	public int getX() {
		return x;
	}
	public void setX(int xV) 
	{
		x+= xV;
	}
	public int getY() {
		return y;
	}
	public void setY(int yV) {
		y+= yV;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public ImageIcon getPic() {
		return pic;
	}
	public void setPic(ImageIcon pic) {
		this.pic = pic;
	}
	}


public class Pictures {
 private String pic;
 private int x;
 private int y;
 private int dx;
 private int dy;
int width;
int height;
private boolean movert;
private boolean movedn;

public Pictures() {
	pic="";
	x=0;
	y=0;
	dx=0;
	dy=0;
	width=0;
	height=0;
	movert=false;
	movedn=false;
}

 public Pictures(String s, int x1, int y1, int w, int h) {
	 pic=s;
	 x=x1;
	 y=y1;
	 dx=0;
	 dy=0;
	 movert=false;
	 movedn=false;
	 width=w;
	 height=h;
 }
 
 public Pictures(String s, int x1, int y1, int w, int h, int dx1, int dy1, boolean r, boolean d) {
	 pic=s;
	 x=x1;
	 y=y1;
	 dx=dx1;
	 dy=dy1;
	 width=w;
	 height=h;
	 movert=false;
	 movedn=false;
 }
 
 public String getPic() {
	 return pic;
	 
 }
 
 public int getX(){
	 return x;
 }
 public int getY(){
	 return y;
 }

public int getWidth() {
	// TODO Auto-generated method stub
	return width;
}

public int getHeight() {
	// TODO Auto-generated method stub
	return height;
}
 public void move() {
	 x+=dx;
	 y+=dy;
	
	 if(x+width>800)
		 x=800-width;
	 if(y+height>600)
	     y=600-height;
 }




 public void bounce(){
	 if (movert) {x+=dx;}
	 else {x-=dx;}
	 if (movedn) {y+=dy;}
	 else {y-=dx;}
	 if(x<0)
	 movert=true;
	 if (x+width>800)
		 movert=false;
	 
	 if(y<0)
		 movedn=true;
	 if(y+height>600)
	 movedn=false;
 }
 public void setdx(int d) {
	 dx=d;
 }
 public void setdy(int c) {
	 dy=c;
 }
 
 
 
}
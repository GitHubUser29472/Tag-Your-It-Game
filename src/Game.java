
import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

	public class Game extends JPanel implements Runnable, KeyListener{
		private BufferedImage back;
		//private Pictures bi;
		//private Pictures p;
		//private Pictures pr;
		private int key;
	
		private Players p;
		private Players p2;
		private String t;
		 private ImageIcon background;
		private Background_Image bi;
		private Player music;
		private int determinant;
		private boolean playSound;
		private boolean playSound2;
		private double time;
		private double curtime;
		private int k;
        private int f;
        private int c;
        private int r;
        
		private int y;
        private int u;
        private int m;
        private int v;
        
        private char screen;
        private boolean playSad;
        private boolean playWin;
        
        private boolean gameStart;
        private boolean addScore;
        private boolean addScore2;
        
        
		
		public Game() {
			back=null;
			new Thread(this).start();
			this.addKeyListener(this);
			key=-1;
		
			p= new Players(30, 100, 50, 50, Color.blue);
			p2=new Players(1250, 100, 50, 50, Color.red);
			bi=new Background_Image();
			music=new Player();
			playSound=true;
			playSound2=true;
		t="Press Space to Start";
		determinant=0;
		 curtime=0;
		 time=System.currentTimeMillis();
		 k=0;
		 f=0;
		 c=0;
		 r=0;
		 addScore=false;
		 addScore2=false;
		 screen='S';
			//bi= new Pictures("HoustonLamarHighSchool.jpg",0,0,800,600);
			//p=new Pictures("vader.png", 200, 300, 300, 200, 0,0, true, true);
		}
		
		public void run() {
			try {
				while(true) {
					Thread.currentThread().sleep(5);
					repaint();
				}
			}
			catch(Exception e) {}
		}
		
		public void paint (Graphics g)
		{
			Graphics2D twoDgraph = (Graphics2D)g;
		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
			if (back==null) {
				back =(BufferedImage) (createImage(getWidth(), getHeight()));
					}

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
			Graphics g2d = back.createGraphics();
			
			//this clears the old image, like an EtchASketch. If you see the old image when we learn motion, you deleted this line.
			g2d.clearRect(0, 0, getSize().width, getSize().height); 
			
			
			//START CODING GRAPHICS HERE
			 screen(g2d);
			//g2d.drawImage(new ImageIcon(bi.getPic()).getImage(),bi.getX(), bi.getY(), bi.getWidth(), bi.getHeight(),this);
			
			
			//g2d.drawImage(new ImageIcon(p.getPic()).getImage(),p.getX(), p.getY(), p.getWidth(), p.getHeight(),this);

			
			
	
			
			
			
			
			
			
			
			
			
			
			//creates a new color
		
			//sets the new color. Think of the computer picking up a pen
		
			
			//sets a new font
			
	
			
			//draws a String starting at x coordinate 20 and y coordinate 30
			/*
		g2d.drawImage(new ImageIcon(bi.getBackground()).getImage(),0,0,getWidth(),getHeight(),this );
			g2d.setColor(Color.black);
			g2d.fillRect(p.getX(), p.getY(), p.getWidth(), p.getHeight());
			g2d.fillRect(p2.getX(), p2.getY(), p2.getWidth(), p2.getHeight());
			g2d.drawString(new DecimalFormat("#0.00").format(curtime),20,30);
			g2d.setColor(Color.green);
			g2d.drawString(t, 300, 300);
			
			*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	/*if(p2.collision(p)) {
		
		
		//p.setScore(1);
		
		
		//g2d.setFont(new Font("chiller", Font.BOLD,54));
		//g2d.drawString("game over", 400, 300);
		
		
		}
*/
			  
			  
			  
			 
			  
			
	
	
	
	
	


	
	
	move();
			
			
			
			//This line tells the program to draw everything above. If you delete this, nothing will show up.
			twoDgraph.drawImage(back, 0, 0, null);
		}
		
		 public void screen(Graphics g2d) {
		        switch (screen) {
		            case 'S':
		                //start screen
		             
		                drawStartScreen(g2d);
		                break;

		            case 'G':
		            	
		            	k=-3;
						f=3;
						c=-3;
						r=3;
						y=-3;
						u=3;
						m=-3;
						v=3;
		            	
		            	
		            	g2d.setColor(Color.blue);
		    			g2d.fillRect(p.getX(), p.getY(), p.getWidth(), p.getHeight());
		    			g2d.setColor(Color.red);
		    			g2d.fillRect(p2.getX(), p2.getY(), p2.getWidth(), p2.getHeight());
		    			g2d.setColor(Color.black);
		    			g2d.drawString(new DecimalFormat("#0.00").format(curtime),20,30);
		    			g2d.setColor(Color.green);
		    			g2d.drawString(t, 300, 300);
		    		
		                //game screen
		            	/*
		                g2d.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
		                g2d.setFont( new Font("Broadway", Font.BOLD, 20));
		                g2d.drawString("Lives: "+ lives, 1000, 80);
		                drawAliens(g2d);
		                moveAliens();
		                drawPlayerShip(g2d);
		                drawSM(g2d);
		                drawAlienMissile(g2d);
		                alienHit();
		                playerHit();
		                checkLose1();
		                checkWin();
		                
		                count++;
		                if (count % 100 == 0) {
		                    getAlienMissile(g2d);
		                }
		                g2d.setColor(Color.black);
		                g2d.drawString("Lives: " + lives, 100, 100);
		                break;

*/
						   break;

		            case 'W':
		            	
		            	/*
		                g2d.setColor(Color.green);
		                g2d.setFont(new Font("chiller", Font.BOLD, 55));
		                g2d.drawString("You Win!!", 500, 300);

		                if (playWin) {
		                    music.playmusic("Ta Da-SoundBible.com-1884170640.wav");
		                    playWin = false;
		                }
		                break;

*/
		            	   break;

		            case 'L':
		            	
		            	
		                g2d.setColor(Color.red);
		                g2d.setFont(new Font("chiller", Font.BOLD, 55));
		                g2d.drawString("Game Over!!", 300, 300);
		               
		                if (playSad) {
		                    music.playmusic("Sad_Trombone-Joe_Lamb-665429450.wav");
		                    playSad = false;
		                }
		                break;
		        }
		    }
		
		 public void reset(){
			
		
			playSad=true;
			  playSound=true;
				playSound2=true;
			t="Press Space to Start";
			determinant=0;
			 curtime=0;
			 time=System.currentTimeMillis();
			 k=0;
			 f=0;
			 c=0;
			 r=0;
		
			
		  }
		
		 public void drawStartScreen(Graphics g2d) {
		    	g2d.setFont( new Font("Broadway", Font.BOLD, 20));
				g2d.setColor(Color.black);
				g2d.drawString("Welcome to Tag your it!", 550, 200);
				g2d.drawString("press space to start", 550, 300);
		
		    }
		
		public void keyTyped(KeyEvent e) {
		
		}public void keyPressed(KeyEvent e) {
			key=e.getKeyCode();
			System.out.println(key);
			if (key==38) {
				p2.setdy(k);
			}
			if (key==68) {
				p.setdx(u);
			}
			if (key==65) {
				p.setdx(y);
			}
			if (key==40) {
				p2.setdy(f);
			}
			if (key==87) {
				p.setdy(c);
			}
			if (key==83) {
				p.setdy(r);
				
			}
			if (key==39) {
				p2.setdx(v);
				}
			if (key==37) {
				p2.setdx(m);
				
				}
			if (key==49) {
				k=0;
				f=0;
				}
			if (key==48) {
				c=0;
				r=0;
				}
			if (key==82) {
				reset();
				}
			
		}
		public void keyReleased(KeyEvent e){
			key=e.getKeyCode();
			if (key==87) {
				p.setdy(0);
			}
		if (key==83) {
			p.setdy(0);
		}
			if (key==38) {
			p2.setdy(0);
			
			}
			if (key==39) {
				p2.setdx(0);
				}
			if (key==37) {
				p2.setdx(0);
				
				}
			
			if (key==40) {
				p2.setdy(0);
				
				}
			if (key==68) {
				p.setdx(0);
			}
			if (key==65) {
				p.setdx(0);
			}
			
			if (key==32) {
				t="";
				 System.out.println("Space key released. Current screen: " + screen);
			screen='G';
			System.out.println("Screen changed to: " + screen);

			}
			
			

		}
		
		
		
		public void move() {
		
			p.move();
			p2.move();
		}
		
		


	
		}
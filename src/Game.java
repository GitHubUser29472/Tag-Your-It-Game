
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
	
		private long lastTagTime;
		private final long cooldownPeriod = 1000; // 1 second cooldown in milliseconds

		private Player1 player1;
		private Player2 player2;
		private It_indicator YourIt;
		private String t;
		 private Pictures background;
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
       private Pictures startScreenImage;
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
        private int witx;
        private int wity;
        private boolean whosit;
		private String whositString;
		private String whosnotitText;
		
		
		
		
		public Game() {
			back=null;
			new Thread(this).start();
			this.addKeyListener(this);
			
			key=-1;
			

			startScreenImage = new Pictures("tag your it both characters.png", 470, 150, 400, 300);
			 player1 = new Player1(30, 100, 50, 100);
			 player2 = new Player2(1250, 100, 50, 100);
			 YourIt = new It_indicator(witx, wity, 80, 80);
			 
			  
		
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
		 whosit=true;
		 playWin = false;
		 
		 if (curtime >= 120) {
             screen = 'W';
         }
		 
		  if (whosit){
		 whosnotitText="Player Two";
		  } else
		  whosnotitText="Player One";
		
		  
		  whositString="Player One";
		 
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

			
			
			 if (whosit){
				 whosnotitText="Player Two";
				  } else
				  whosnotitText="Player One";
			
			
			
			
			
			
			
			
			
			
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
			
			
			
			
			
			
			
			
			
			
			 curtime = (System.currentTimeMillis() - time) / 1000;
			
			
			
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
		    	
		    			g2d.setColor(Color.red);
		    			
		    	        
		    			
		    			
		    			
		    			g2d.setColor(Color.green);
		    			g2d.drawString(t, 300, 300);
		    			g2d.drawString(new DecimalFormat("#0.00").format(curtime),20,30);
		    			
		    			g2d.setFont( new Font("Calibri", Font.BOLD, 20));
						g2d.setColor(Color.black);
		    			g2d.drawString(whositString,550,50);
		    		
		               
		    					
		    			if (player1.collision(player2)) {
		                    long currentTime = System.currentTimeMillis();
		                    if (currentTime - lastTagTime >= cooldownPeriod) {
		                        if (whosit) {
		                            whosit = false;
		                            whositString = "Player Two is it!";
		                        } else {
		                            whosit = true;
		                            whositString = "Player One is it!";
		                        }
		                        lastTagTime = currentTime; // Update the last tag time
		                        System.out.println("Collision detected!");
		                    }
		                }

		    			
		    			
		    			 if(whosit) {
		    				 whositString="Player One is it!";
		    				 whosnotitText="";
		    					witx=player1.getX();
		    					wity=player1.getY();
		    				}else {
		    				
		    					witx=player2.getX();
		    					wity=player2.getY();
		    				}			
		    			
		    			
		    			
		    			drawPlayers(g2d);
		    			checkWin();
						   break;

		            case 'W':
		            	g2d.setFont( new Font("Calibri", Font.BOLD, 20));
						g2d.setColor(Color.black);
		            	g2d.drawString(whosnotitText + " Wins!", 550, 250);
		            	
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
		 
		 
		  public void drawPlayers(Graphics g2d) {
		        g2d.drawImage(player1.getPic().getImage(), player1.getX(), player1.getY(), player1.getWidth(), player1.getHeight(), this);
		        g2d.drawImage(player2.getPic().getImage(), player2.getX(), player2.getY(), player2.getWidth(), player2.getHeight(), this);
		        g2d.drawImage(YourIt.getPic().getImage(), witx-20, wity-90, YourIt.getWidth(), YourIt.getHeight(), this);
		    }
		 
		 
		 public void drawStartScreen(Graphics g2d) {
			 
		    	g2d.setFont( new Font("Calibri", Font.BOLD, 20));
				g2d.setColor(Color.black);
				g2d.drawString("Welcome to Tag your it!", 550, 100);
				g2d.drawString("press space to start", 550, 600);
				
		        g2d.drawImage(new ImageIcon(startScreenImage.getPic()).getImage(), startScreenImage.getX(), startScreenImage.getY(), startScreenImage.getWidth(), startScreenImage.getHeight(), this);
		    }
		 
		 long currentTime = System.currentTimeMillis();
		 
		 public void checkWin() {
			 if (curtime >= 90) {
	             screen = 'W';
	         }
		    }
		
		public void keyTyped(KeyEvent e) {
			
			
		}public void keyPressed(KeyEvent e) {
			key=e.getKeyCode();
			System.out.println(key);
			if (key==38) {
				player2.setdy(k);
				System.out.println(whositString);
			}
			if (key==68) {
				player1.setdx(u);
			}
			if (key==65) {
				player1.setdx(y);
			}
			if (key==40) {
				player2.setdy(f);
			}
			if (key==87) {
				player1.setdy(c);
			}
			if (key==83) {
				player1.setdy(r);
			}
			if (key==39) {
				player2.setdx(v);
				}
			if (key==37) {
				player2.setdx(m);
				
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
				player1.setdy(0);
			}
		   if (key==83) {
			player1.setdy(0);
		    }
			if (key==38) {
			player2.setdy(0);
			
			}
			if (key==39) {
				player2.setdx(0);
				}
			if (key==37) {
				player2.setdx(0);
				
				}
			
			if (key==40) {
				player2.setdy(0);
				
				}
			if (key==68) {
				player1.setdx(0);
			}
			if (key==65) {
				player1.setdx(0);
			}
			
			if (key==32) {
				t="";
				 System.out.println("Space key released. Current screen: " + screen);
			screen='G';
			System.out.println("Screen changed to: " + screen);
		
			}
			 
			

		}
		
		
		
		public void move() {
		
			player1.move();
			player2.move();
			YourIt.move();
			if (whosit) {
	            witx = player1.getX();
	            wity = player1.getY();
	        } else {
	            witx = player2.getX();
	            wity = player2.getY();
	        }

		}
		
	
	


	
		}
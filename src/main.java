

import javax.swing.JFrame;

public class main{
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Java Fighting Game");
		
		game game = new game();
		window.add(game);
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		game.startGameThread();
	}
}
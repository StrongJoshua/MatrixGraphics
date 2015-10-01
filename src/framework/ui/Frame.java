
package framework.ui;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import main.Game;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	private GraphicsHandler graphics;
	private JPanel drawPanel;

	public Frame () {
		super("Matrix Graphics");
		graphics = new GraphicsHandler();
		drawPanel = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public void paintComponent (Graphics g) {
			graphics.draw(g);
			}
		};

		this.add(drawPanel);
		this.pack();
		this.setLocationRelativeTo(null);
	}

	public GraphicsHandler getGraphicsHandler () {
		return graphics;
	}

	public static void main (String[] args) {
		Frame f = new Frame();
		SwingUtilities.invokeLater( () -> f.setVisible(true));
		Game game = new Game(f);
		game.start();
	}
}

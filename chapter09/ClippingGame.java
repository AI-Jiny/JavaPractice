package chapter09;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClippingGame extends JFrame {

	public ClippingGame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyCanvas mc = new MyCanvas();
		setContentPane(mc);

		setSize(500, 500);
		setVisible(true);
		
		mc.setFocusable(true);
		mc.requestFocus();

	}

	public static void main(String[] args) {
		new ClippingGame();
	}

	class MyCanvas extends JPanel {

		Image im;
		int x = 0, y = 0;

		public MyCanvas() {

			setBackground(Color.black);
			ImageIcon img = new ImageIcon(".\\Img\\pg.jpg");
			im = img.getImage();

			// 리스너 부착
			addKeyListener(new MykeyListener());
		}

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.setClip(x, y, 50, 50);
			g.drawImage(im, 0, 0, getWidth(), getHeight(), this);

			g.setColor(Color.RED);
			g.drawString("Java", 250, 50);
			g.drawString("Monday", 20, 200);
			g.drawString("Funny", 150, 50);
			g.drawString("Java", 300, 200);

		}

		class MykeyListener implements KeyListener {

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					y = y - 10;

					if (y < 0) {
						y = 0;
					}

				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					y = y + 10;

					if (y > getHeight()) {
						y = getHeight();
					}

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					x = x - 10;
					if (x < 0) {
						x = 0;
					}
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					x = x + 10;
					if (x > getWidth()) {
						x = getWidth();
					}
				}

				repaint();

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		}

	}

}

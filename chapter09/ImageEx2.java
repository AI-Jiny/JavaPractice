package chapter09;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageEx2 extends JFrame {

	public ImageEx2() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new MyPanel());

		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ImageEx2();

	}

	class MyPanel extends JPanel {

		ImageIcon img = new ImageIcon(".\\Img\\Flower.jpg");
		Image im = img.getImage();
		int x = 0, y = 0;

		// 초기화면 구현할 생성자
		public MyPanel() {

			// 리스너 부착
			addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseMoved(MouseEvent e) {
				}

				@Override
				public void mouseDragged(MouseEvent e) {
					x = e.getX();
					y = e.getY();

					repaint();

				}
			});

		}

		// 페인트
		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.drawImage(im, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.WHITE);
			g.fillArc(x, y, 30, 30, 0, 360);
			g.setColor(Color.black);
			g.fillArc(x+10, y+10, 10, 10, 0, 360);

		}

	}

}

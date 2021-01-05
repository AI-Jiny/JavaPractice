/*
	repaint()	:	응용프로그램에서 변경사항이 바로바로 안 나타나는 경우가 종종 발생한다.
					자바 플랫폼에 컴포넌트 페인팅을 강제로 실행할 것을 지시하는 메소드이다.
					이것을 처리해주면 빠른 시간내에 컴포넌트에 대한 변경이 화면에 반영된다.
*/
package chapter09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MousePaint extends JFrame {

	public MousePaint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		MyPanel mp = new MyPanel();
		c.add(mp, BorderLayout.CENTER);

		
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		new MousePaint();

	}

	class MyPanel extends JPanel {

		Vector<Point> start = new Vector<>();
		Vector<Point> end = new Vector<>();

		public MyPanel() {
			setBackground(new Color(232, 169, 145));

			addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {

					Point endP = (Point) e.getPoint();
					end.add(endP);
					
					repaint();	//마우스를 누르고 뗀 다음에 다시 그려달라고 paintComponent()를 호출한다.

				}

				@Override
				public void mousePressed(MouseEvent e) {
//					int x = e.getX();
//					int y = e.getY();
//					Point p = new Point(x, y);
					Point startP = e.getPoint();
					start.add(startP);

				}

				@Override
				public void mouseExited(MouseEvent e) {}

				@Override
				public void mouseEntered(MouseEvent e) {}

				@Override
				public void mouseClicked(MouseEvent e) {}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			g.setColor(Color.black);
			for (int i = 0; i < start.size(); i++) {
				Point s = start.elementAt(i);
				Point e = end.elementAt(i);

				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}

		}

	}
}

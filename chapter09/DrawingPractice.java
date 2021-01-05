package chapter09;

import java.awt.*;
import javax.swing.*;

public class DrawingPractice extends JFrame {

	MyDrawing panel = new MyDrawing();

	public DrawingPractice() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
panel.setBackground(Color.BLACK);
		
		
		
		
		setSize(650, 800);
		setVisible(true);

	}

	public static void main(String[] args) {
		new DrawingPractice();

	}

	class MyDrawing extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
		
			super.paintComponent(g);
			
			g.setColor(Color.yellow);
			g.drawLine(10, 10, 300, 300);
			
			g.setColor(new Color(241,113,85));
			g.fillOval(400, 50, 100, 200);
			g.drawRect(400, 50, 100, 200);
			
			g.setColor(Color.red);
			int [] x = {100, 20, 150};
			int [] y = {100 ,150 , 200};
			g.fillPolygon(x, y, 3);
			
			g.setColor(Color.RED);
			g.fillArc(200, 300, 400, 400, -30, 120);
			g.setColor(Color.BLUE);
			g.fillArc(200, 300, 400, 400, 90, 120);
			g.setColor(Color.YELLOW);
			g.fillArc(200, 300, 400, 400, 210, 120);
				
			
			
			
			
		}

	}

}

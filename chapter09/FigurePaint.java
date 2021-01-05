/*
	도형그리기
		* drawLine(x1, y1, x2, y2)			//선 
		* drawArc(x, y, w, h, 시작각, 회전각)	//원, 원호 
		* drawOval(x, y, w, h)				//타원
		* drawRect(x, y, w, h)				//사각형
		* drawRound(x, y, w, h, arcW, arcH)	//둥근 사각형
		* drawPolygon(int[] x, int[] y, n)	//다각형

*/
package chapter09;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FigurePaint extends JFrame {

	MyPanel panel = new MyPanel();
	
	
	public FigurePaint() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		panel.setBackground(Color.WHITE);
		
		
		
		
		setSize(600,450);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new FigurePaint();
		
	}
	
	class MyPanel extends JPanel{
		
		@Override
		protected void paintComponent(Graphics g) {
		
			super.paintComponent(g);
			
			//선
			g.setColor(new Color(100,170,192));
			g.drawLine(20, 20, 100, 100);
			g.drawLine(100, 20, 20, 100);
			
			//사각형
			g.drawRect(20, 20, 80, 80);
			
			for(int i=0; i<10; i++) {
				int red = (int)(Math.random()*250+1);
				int green = (int)(Math.random()*250+1);
				int blue = (int)(Math.random()*250+1);
				
				g.setColor(new Color(red, green, blue));
				g.drawRect(20+(i*5), 120+(i*5), 100, 100);
			}
			
			//둥근 사각형
			g.setColor(new Color(128, 197, 250));
			g.fillRoundRect(20, 300, 100, 100, 10, 10);
			
			//원
			g.setColor(new Color(241, 113, 85));
			g.fillArc(200, 20, 100, 100, 45, 270);
			g.setColor(Color.black);
			g.fillArc(230, 50, 10, 10, 0, 360);
			
			//다각형
			int	[] x = {210,175,60,150,110,210,310,270,360,245,210};
			int [] y = { 60,160,160,225,340,270,340,225,160,160,60};
			g.drawPolygon(x, y, 10);
			
			
		}
		
		
	}
	
	
	
}

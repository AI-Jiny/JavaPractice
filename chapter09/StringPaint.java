/*
	DrawString(String str, int x, int y)
*/

package chapter09;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StringPaint extends JFrame{
	
	MyPanel panel = new MyPanel()	;
	
	public StringPaint() {
	
		setTitle("Drawing String");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setContentPane(panel);
		
		setSize(350,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new StringPaint();
		
	}
	
	
	//판넬, 캔버스로 이용
	class MyPanel extends JPanel{
		
		public MyPanel() {
		
			setBackground(new Color(0x00ffffcc));
			JLabel la = new JLabel("Java Study");
			la.setOpaque(true);
			la.setBackground(Color.WHITE);
			add(la);
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);	//화면 초기화
			
			
			g.setColor(Color.BLACK);
			g.drawString("I LOVE YOU", 30, 30);
			
			
			g.setColor(new Color(204,231,23));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How r u doing?", 30, 80);
			
			
			
			g.setColor(new Color(191,60,177));
			for(int i=1; i<=5; i++) {
				
				g.setFont(new Font("Arial", Font.BOLD, i*10));
				g.drawString("Hello", 30, 60+i*60 );
				
			}
			
			
			
			
			
			
		}
		
	}
	
	
}

package listener;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ClickAndCatchGame extends	JFrame {
	
	JPanel c;
	JLabel la;
	
	public ClickAndCatchGame() {
		
		
		setTitle("아이콘 잡기 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = new JPanel();
		setContentPane(c);
		c.setLayout(null);
		c.setBackground(Color.LIGHT_GRAY);
		
		
		la = new JLabel(new ImageIcon(".\\IMG\\cat.png"));
		la.setSize(150, 150);
		la.setLocation(0, 0);
		
		
		c.addMouseListener(new MyMouseListener_());
		
		
		c.add(la);
		setSize(1000,1000);
		setVisible(true);
		
	}

	
	class MyMouseListener_ extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			int x = (int)(Math.random()*1000-50);
			int y = (int)(Math.random()*1000-50);
			
	
			la.setLocation(x,y);
			
			
		}

}
	
	
	public static void main(String[] args) {
		new ClickAndCatchGame();
		
		
	}
}

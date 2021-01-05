package listener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 내부익명리스너 extends JFrame {
	
	JPanel c = new JPanel();
	JLabel la;
	
	public 내부익명리스너() {
	
		setTitle("내부 익명 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c);
		c.setLayout(null);
		c.setBackground(Color.PINK);
		

		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		la = new JLabel(new ImageIcon(".\\IMG\\heart.png"));
		
		la.setSize(50,50);
		la.setLocation(50,50);
		
		c.add(la);
		
		setSize(900,900);
		setVisible(true);
		
	}
	
	class MyMouseListener3 implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		new 내부익명리스너();
		
	}
	

}

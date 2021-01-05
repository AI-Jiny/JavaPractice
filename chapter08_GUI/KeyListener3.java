package listener;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener3 extends JFrame {
	
	JPanel c = new JPanel();
	JLabel la1, la2, la3;
	final int FLYING_UNIT = 10;
	
	public KeyListener3() {
		
		setTitle("상하좌우 마우스로 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c);
		c.setLayout(null);
		c.setBackground(new Color(0x00FFFFFF));
		
		
		la1 = new JLabel(new ImageIcon(".\\IMG\\maze.png"));	//배경이미지
		la1.setSize(1900,1000);
		la1.setLocation(-150, -90);
		
		la2 = new JLabel(new ImageIcon(".\\IMG\\cat.png"));	//움직일이미지
		la2.setSize(150,150);
		la2.setLocation(300,100);
		
		la3 = new JLabel(new ImageIcon(".\\IMG\\fish.png"));	//상대 이미지
		la3.setSize(200,150);
		la3.setLocation(1150,700);
		
		
		c.add(la3);
		c.add(la2);
		c.add(la1);
		
		//////////////////////////////////리스너 부착/////////////
		
		c.addKeyListener(new MyKeyListener3());
		
		//////////////////////////////////////////////////////
		
		
		setSize(1950, 1000);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	
	}
	
	class MyKeyListener3 extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			
		int keyCode = e.getKeyCode();
		
		switch(keyCode) {
		
		case KeyEvent.VK_UP:
			la2.setLocation(la2.getX(), la2.getY()-FLYING_UNIT); break;
				
		case KeyEvent.VK_DOWN:
			la2.setLocation(la2.getX(), la2.getY()+FLYING_UNIT);break;
			
		case KeyEvent.VK_LEFT:
			la2.setLocation(la2.getX()-FLYING_UNIT, la2.getY());break;

		case KeyEvent.VK_RIGHT:
			la2.setLocation(la2.getX()+FLYING_UNIT, la2.getY());break;
		
		
		}
		
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		new KeyListener3();
		
		
	}
	

}

package listener;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseListener2 extends JFrame {
	
	JPanel c = new JPanel();
	JLabel la;
	
	public MouseListener2() {
		
		setTitle("마우스 이벤트 활용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(c); //jpanel을 컨테이너로 교체
		c.setLayout(null);
		
		c.addMouseListener(new MyMouseListener2());
		
		la = new JLabel("안녕");
		
		la.setSize(50,50);
		la.setLocation(30,30);
		
		c.add(la);
		setSize(1500,900);
		setVisible(true);
		
	}
	
	class MyMouseListener2 implements  MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		new MouseListener2();
		
	}
	

}

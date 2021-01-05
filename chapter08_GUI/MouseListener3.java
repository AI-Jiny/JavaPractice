/*
	MouseListener
		* 리스너 종류
			* MouseListener : 5가지
			* MouseMotionListener : 2가지
			* MouseWheelListener : 1가지
		
		* 메소드
			* getX(), getY()
			* getClickCount()	:	마우스의 클릭획수 리턴
			* getButton()	:	마우스의 왼쪽버튼인지 오른쪽버튼인지, 중앙버튼인지
								MouseEvent.BUTTON1/2/3
								
*/
package listener;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListener3 extends JFrame {

	JPanel c = new JPanel();
	JLabel la;
	

	public MouseListener3() {

		setTitle("Mouse Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(c);

		la = new JLabel("Mouse Event");
		
		
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());
		c.addMouseWheelListener(new MyMouseListener());
		
		//글자 크기 설정하는 법/////////////////////////////////
		la.setFont(new Font("Arial", Font.PLAIN, 25));
		////////////////////////////////////////////////
		
		c.add(la);

		
		setSize(500, 500);
		setVisible(true);

	}
	
	public static void main(String[] args) {

		new MouseListener3();
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener, MouseWheelListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
			c.setBackground(Color.yellow);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
			c.setBackground(Color.CYAN);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			
			la.setText("Mouse Pressed ("+e.getX()+", "+e.getY()+")");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		
		
		@Override
		public void mouseDragged(MouseEvent e) {

			la.setText("Mouse Dragged ("+e.getX()+", "+e.getY()+")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			
			la.setText("Mouse Moved ("+e.getX()+", "+e.getY()+")");
			
		}

		
		
		
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

}






package listener;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MouseWheel extends JFrame{
	
	
	JLabel la;
	
	
	public MouseWheel() {
		
		setTitle("마우스 휠로 글자 조정하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel c = new JPanel();
		setContentPane(c);
		c.setLayout(new FlowLayout());
		
		la = new JLabel("LOVE JAVA", SwingConstants.CENTER);
		la.setSize(100, 50);
		la.setFont(new Font("TimesRomance", Font.PLAIN, 50));
		
		
		la.addMouseWheelListener(new MyMouseWheel());
		c.add(la);
		
		
		
		setSize(1000,800);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
	}
	
	class MyMouseWheel implements MouseWheelListener{

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			
			int n = e.getWheelRotation();		//휠의 값
			
			if(n<0) {
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("TimesRomance", Font.PLAIN, size-5));
			}
			else {
				
				JLabel la = (JLabel)e.getSource();
				Font f = la.getFont();
				int size = f.getSize();
				la.setFont(new Font("TimesRomance", Font.PLAIN, size+5));
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		new MouseWheel();
		
	}

}

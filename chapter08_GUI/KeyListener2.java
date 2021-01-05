package listener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListener2 extends JFrame {
	
	JPanel c;
	JLabel la;
	
	public KeyListener2() {
		setTitle("가상키학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = new JPanel();
		setContentPane(c);
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
								//라벨이 부착되는 위치(글씨 아니고 라벨)
		
		
		
		//리스너 부착//////////////////////////////////////////
		
		c.addKeyListener(new MyKeyListener());
		
		///////////////////////////////////////////////////
		
		
		
		la = new JLabel("***색깔바꾸기***");
		la.setSize(50,30);
		c.add(la);
		
		//포커스 설정/////////
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		//////////////////
		
		setSize(900,700);
	
	}
	
	
	class MyKeyListener extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyChar()=='r') {
				c.setBackground(Color.RED);
					
			}else if(e.getKeyChar() == 'y') {
				c.setBackground(Color.YELLOW);
			}else if(e.getKeyChar()=='p') {
				c.setBackground(new Color(153, 0, 133));
				
				
			}else if(e.getKeyCode()==KeyEvent.VK_F1) {	//가상키 활용
				c.setBackground(Color.PINK);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new KeyListener2();
	}

}

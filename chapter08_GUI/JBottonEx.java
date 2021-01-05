/*
	JBotton
		* 생성자
		* 이미지버튼
			* setIcon()			:	디폴트 이미지
			* setRolloverIcon()	:	버튼위로 마우스가 올라갈때 출력되는 이미지	
			* setPressedIcon()	:	버튼이 눌러져 있는 동안 출력되는 이미지
		* 버튼/레이블 정렬
			* 수평정렬	:	setHorizontalAignment(SwingConstants.Left/Right/Center)
			* 수직정렬	:	setVertical...
*/
package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JBottonEx extends JFrame{

	public JBottonEx() {
	
		setTitle("Image Button");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(new Color(0x00D5D5D5));
		
		ImageIcon normal = new ImageIcon(".\\IMG\\telblue.gif");
		ImageIcon rollover = new ImageIcon(".\\IMG\\telred1.gif");
		ImageIcon pressed = new ImageIcon(".\\IMG\\telred2.gif");
		
		
		JButton btn = new JButton("CALL");
		btn.setBackground(Color.BLUE);
		btn.setOpaque(true);
		btn.setSize(500,500);
		
		btn.setIcon(normal);
		btn.setRolloverIcon(rollover);
		btn.setPressedIcon(pressed);
		
		
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		btn.setVerticalAlignment(SwingConstants.TOP);
		c.add(btn);
		
		JLabel la = new JLabel("Where is here?");
		la.setHorizontalAlignment(SwingConstants.RIGHT);
		la.setVerticalAlignment(SwingConstants.TOP);	
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JBottonEx();
	}
}

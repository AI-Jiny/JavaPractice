package GUI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame10 extends JFrame {

	public Frame10() {

		setTitle("BorderLayout2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		c.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("Menu");
		btn1.setBackground(Color.black);
		btn1.setForeground(Color.PINK);
		c.add(btn1, BorderLayout.NORTH);
		
		c.add(new JButton("도서목록"), BorderLayout.WEST);
		
		
		
		
		
		JPanel p = new JPanel();	//부품이면서 컨테이너
		p.setBackground(Color.MAGENTA);
		c.add(p, BorderLayout.CENTER);
		
			p.setLayout(new BorderLayout());
			p.add(new JButton("전공서적"), BorderLayout.NORTH);
			p.add(new JButton("일반서적"), BorderLayout.CENTER);
			p.add(new JButton("교양서적"), BorderLayout.SOUTH);
			

		
		
		
		
		

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		
		Frame10 f = new Frame10();
		

	}

}

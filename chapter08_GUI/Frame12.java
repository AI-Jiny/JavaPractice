package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame12 extends JFrame{
	
	public Frame12() {
		setTitle("학생부 입력폼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(new Color(123, 50,50));
		c.setLayout(new GridLayout(5,4,2,4));
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("비번"));
		c.add(new JTextField(""));
		
		setSize(500,500);
		setVisible(true);
		
	
	}

	
	public static void main(String[] args) {
		
		Frame12 f = new Frame12();
		
	}
}

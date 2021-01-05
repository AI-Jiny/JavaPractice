package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame11 extends JFrame {

	public Frame11() {

		setTitle("Grid Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 3));
		
		JButton b; 
		b = new JButton("1");
		b.setBackground(Color.PINK);
		c.add(b);
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("0"));
		c.add(new JButton("+"));
		c.add(new JButton("-"));
		
		
		
		
		

		setSize(600, 500);
		setVisible(true);
	}

	public static void main(String[] args) {

		Frame11 f = new Frame11();

	}

}

package component;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldEx1 extends JFrame {

	public JTextFieldEx1() {

		setTitle("Text Field");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel name = new JLabel("Name : ");
		name.setOpaque(true);
		name.setBackground(Color.PINK);
		
		JTextField nameText1 = new JTextField("이름",10);
		
		JLabel major = new JLabel("Major : ");
		major.setOpaque(true);
		major.setBackground(Color.MAGENTA);
		
		JTextField nameText2 = new JTextField("전공",10);
		
		JLabel address = new JLabel("Address : ");
		address.setOpaque(true);
		address.setBackground(Color.CYAN);
		
		JTextField nameText3 = new JTextField("주소",10);
		nameText3.setEditable(false);
		
		
		c.add(name);
		c.add(nameText1);
		c.add(major);
		c.add(nameText2);
		c.add(address);
		c.add(nameText3);
		
		
		
		setSize(200,150);
		setVisible(true);
			
	}

	public static void main(String[] args) {
		new JTextFieldEx1();
	}

}

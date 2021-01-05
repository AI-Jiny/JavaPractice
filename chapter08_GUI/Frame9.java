package GUI_Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame9 extends JFrame {
	public Frame9() {
		setTitle("Border Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout(10, 10));

		contentPane.add(new JButton("ADD"), BorderLayout.WEST);
		contentPane.add(new JButton("SUB"), BorderLayout.EAST);
		contentPane.add(new JButton("MUL"), BorderLayout.NORTH);
		contentPane.add(new JButton("DIV"), BorderLayout.SOUTH);
		contentPane.add(new JButton("CENTER"), BorderLayout.CENTER);

		setSize(900,700);
		setVisible(true);

	}

	public static void main(String[] args) {

		Frame9 f = new Frame9();

	}

}

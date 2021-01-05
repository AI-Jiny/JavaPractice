package GUI_Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Frame7 extends JFrame {

	public Frame7() {

		setTitle("일곱번째 창");

		Container contentPane = getContentPane();

		contentPane.setBackground(Color.cyan);

		JButton btn = new JButton("okay");
		contentPane.add(btn, BorderLayout.NORTH);
		contentPane.add(new JButton("Cancle"), BorderLayout.SOUTH);
		contentPane.add(new JButton("Ignore"), BorderLayout.EAST);
		contentPane.add(new JButton("Hi"), BorderLayout.WEST);
		contentPane.add(new JButton("Center"), BorderLayout.CENTER);

		setSize(600, 400);
		setVisible(true);

	}

	public static void main(String[] args) {

		Frame7 f = new Frame7();

	}

}

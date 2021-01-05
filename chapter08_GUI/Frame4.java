package GUI_Swing;

import java.awt.Button;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame4 {

	public static void main(String[] args) {

		JFrame f = new JFrame();

		f.setSize(500, 300);
		f.setLocation(100, 100);
		f.setTitle("김효진");

		Container contentPane = f.getContentPane();
		JButton btn1 = new JButton("Start!");
		JButton btn2 = new JButton("End");

		contentPane.add(btn1);
		contentPane.add(btn2);

		f.setVisible(true);

	}

}

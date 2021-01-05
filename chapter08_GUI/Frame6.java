package GUI_Swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame6 extends JFrame {

	public Frame6() {

		setTitle("여섯번째, 상속");
		Container contentPane = getContentPane();
		JButton btn = new JButton("시작");
		contentPane.add(btn);
		
		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {

		Frame6 f = new Frame6();

	}

}

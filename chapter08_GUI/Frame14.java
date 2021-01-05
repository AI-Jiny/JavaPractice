package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame14 extends JFrame {

	public Frame14() {

		setTitle("칼라그리드 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentpane = getContentPane();
		contentpane.setLayout(new GridLayout(1, 10));

		JButton[] btn = new JButton[10];
		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.GRAY, Color.DARK_GRAY,
				Color.PINK, Color.magenta, Color.CYAN};
		
		for(int i = 0; i<10; i++) {
			
			btn[i] = new JButton(Integer.toString(i));
			int index = (int)(Math.random()*9+1);
			btn[i].setBackground(color[index]);
			contentpane.add(btn[i]);
		}
		
		setSize(800, 100);
		setVisible(true);

	}

	public static void main(String[] args) {

		Frame14 f = new Frame14();

	}

}

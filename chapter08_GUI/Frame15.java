package GUI_Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame15 extends JFrame {

	public Frame15() {

		setTitle("4행 4열");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentpane = getContentPane();
		contentpane.setLayout(new GridLayout(4, 4));

		JLabel [] label = new JLabel[16];

		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.GRAY, Color.DARK_GRAY,
				Color.PINK, Color.magenta, Color.CYAN, Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.GRAY};

		for (int i = 0; i <label.length; i++) {
			label[i]= new JLabel(Integer.toString(i));
			label[i].setOpaque(true);	//불투명 설정
			label[i].setBackground(color[i]);
			contentpane.add(label[i]);
			
		}
		
		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {

		Frame15 fr = new Frame15();

	}

}

package chapter09;

import java.awt.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

//0~9까지의 숫자가 임의의 위치에 뿌려지고, 0부터 순서대로 클릭할때만 사라진다.
//마지막 숫자가 사라진다면(화면이 비워지면) 다시 숫자가 뿌려진다.

public class Ex5 extends JFrame {

	Container c = getContentPane();
	JLabel[] la = new JLabel[10];
	int count = 0;

	public Ex5() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(null);
		c.setBackground(Color.CYAN);

		for (int i = 0; i < 10; i++) {
			la[i] = new JLabel("");
			la[i].setText("" + i);
			la[i].setSize(30, 30);
			la[i].setFont(new Font("Arial", Font.BOLD, 20));

			int x = (int) (Math.random() * 450);
			int y = (int) (Math.random() * 450);

			la[i].setLocation(x, y);
			la[i].addMouseListener(new MyMouseListener());
			c.add(la[i]);

		}

		setSize(500, 500);
		setVisible(true);

	}

	class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {

			JLabel a = (JLabel) e.getSource();

			if (la[count] == a) {

				a.setVisible(false);
				count++;

				int x = (int) (Math.random() * 450);
				int y = (int) (Math.random() * 450);
				a.setLocation(x, y);

				if (la[9].isVisible()) {

				} else {
					for (int i = 0; i < 10; i++) {

						la[i].setVisible(true);
						count=0;
					}

				}

			}

		}

	}

	public static void main(String[] args) {
		new Ex5();
	}

}

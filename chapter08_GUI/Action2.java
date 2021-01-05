package listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Action2 extends JFrame {

	public Action2() {

		setTitle("Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentpane = getContentPane();
		contentpane.setLayout(new FlowLayout());
		contentpane.setBackground(Color.BLACK);

		JButton b = new JButton("Start");
	

		b.addActionListener(new MyActionListener2());
		contentpane.add(b);

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Action2();
	}

}

class MyActionListener2 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();

		if (btn.getText().equals("Start")) {
			btn.setText("End");
			btn.setBackground(Color.CYAN);
		}else {
			btn.setText("Start");
			btn.setBackground(Color.PINK);
		}

	}

}
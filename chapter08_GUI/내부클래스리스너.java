package listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 내부클래스리스너 extends JFrame {

	JPanel p;

	public 내부클래스리스너() {

		setTitle("내부클래스 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 5));

		
		JButton b = new JButton("Action");
		b.addActionListener(new MyActionListener2());
		c.add(b, BorderLayout.NORTH);

		
		p = new JPanel();
		p.setBackground(new Color(0x00D4F4FA));
		c.add(p, BorderLayout.CENTER);

		setSize(300, 200);
		setVisible(true);

	}

	class MyActionListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton jbt = (JButton) e.getSource();

			if (jbt.getText().equals("Action")) {

				jbt.setText("액션");

				p.setBackground(Color.MAGENTA);

			} else {

				jbt.setText("Action");
				p.setBackground(Color.PINK);
			}

		}

	}

	public static void main(String[] args) {

		new 내부클래스리스너();

	}
}

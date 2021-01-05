package chapter09;

import java.awt.*;

//슬라이더의 크기와 글씨 크기가 비례하는 화면 만들기

import javax.swing.*;
import javax.swing.event.*;

public class Ex4 extends JFrame {

	Container c;
	JSlider s;
	JLabel p;

	public Ex4() {

		setTitle("JSlider Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.PINK);

		p = new JLabel("I LOVE JAVA", SwingConstants.CENTER);

		s = new JSlider(0, 100, 25);
		s.setPaintLabels(true);
		s.setPaintTicks(true);
		s.setPaintTrack(true);
		s.setMajorTickSpacing(5);
		s.setMinorTickSpacing(1);
		s.setBackground(Color.WHITE);

		s.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int size = s.getValue();
				p.setFont(new Font("Arial", Font.BOLD, size));

			}
		});

		c.add(s, BorderLayout.NORTH);
		c.add(p, BorderLayout.CENTER);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex4();
	}
}

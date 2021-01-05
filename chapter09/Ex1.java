package chapter09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

//체크 박스 두개(버튼비활성화, 버튼감추기), 클릭시 각각의 작용이 일어남 

public class Ex1 extends JFrame {

	JCheckBox c1, c2;
	JButton b;

	public Ex1() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c1 = new JCheckBox("버튼 비활성화");
		c1.setBackground(Color.white);
		c2 = new JCheckBox("버튼 감추기");
		c2.setBackground(Color.white);

		b = new JButton("***BUTTON***");

		c1.addItemListener(new MyButtonState());
		c2.addItemListener(new MyButtonState());

		c.setBackground(Color.cyan);
		
		c.add(c1);
		c.add(c2);
		c.add(b);

		setSize(300, 120);
		setVisible(true);

	}

	class MyButtonState implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// 선택 시 작용 설정
			if (e.getItem() == c1) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					b.setEnabled(false);
				} else {
					b.setEnabled(true);
				}

			} else {

				if (b.isVisible()) {
					b.setVisible(false);
				} else {
					b.setVisible(true);
				}
			}

		}

	}

	public static void main(String[] args) {
		new Ex1();
	}

}

package chapter09;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;

public class Ex3 extends JFrame {

	// 타이틀 관련 필드
	JLabel money;
	JTextField text;
	JButton btn;
	int priceAmount = 0;

	// 돈 단위 저장 배열
	String[] price = { "오만원", "만원", "천원", "오백원", "백원", "오십원", "십원", "일원" };
	// TextField 저장 배열
	JTextField[] tf = new JTextField[8];
	// 갯수 출력 저장 배열
	int[] moneyNum = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
	int[] change = { 0, 0, 0, 0, 0, 0, 0, 0 };

	// 체크박스 배열
	JCheckBox[] check = new JCheckBox[8];

	public Ex3() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.setBackground(Color.PINK);

		c.add(new Title(), BorderLayout.NORTH);

		c.add(new MyPanel(), BorderLayout.CENTER);

		setSize(300, 400);
		setVisible(true);

	}

	class Title extends JPanel {

		public Title() {

			money = new JLabel("금액");
			text = new JTextField(10);
			btn = new JButton("계산");

			btn.addMouseListener(new MyMouseListener());

			add(money);
			add(text);
			add(btn);

		}

	}

	class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			teemo();
		}

	}

	class InnerPanel extends JPanel {

		public InnerPanel(JLabel la, JTextField tf, JCheckBox check) {

			setLayout(new BorderLayout());

			add(la, BorderLayout.WEST);
			add(tf, BorderLayout.CENTER);
			add(check, BorderLayout.EAST);

		}

	}

	class MyPanel extends JPanel {

		public MyPanel() {

			setOpaque(false);

			for (int i = price.length - 1; i >= 0; i--) {

				JLabel la = new JLabel(price[i]);
				tf[i] = new JTextField("", 10);
				check[i] = new JCheckBox();

				check[i].addItemListener(new MyCheckBox());

				add(new InnerPanel(la, tf[i], check[i]), SwingConstants.CENTER);

			}

		}

		class MyCheckBox implements ItemListener {

			@Override
			public void itemStateChanged(ItemEvent e) {

				teemo();

			}

		}

	}

	void teemo() {

		String inputText = text.getText().trim();
		char[] ari = inputText.toCharArray();
		boolean isNumber = true;
//		"999b999"
		for (char k : ari) {

			int temp = (int) k;

			if (temp < 48 || temp > 57) {
				isNumber = false;
				break;
			}

		}

		if (inputText.length() == 0) {
			return;

		} else if (!isNumber) {

			return;
		}

		priceAmount = Integer.parseInt(inputText);

		for (int i = 0; i < price.length; i++) {

			if (check[i].isSelected()) {

				change[i] = (int) priceAmount / moneyNum[i];
				priceAmount = (int) priceAmount % moneyNum[i];

				tf[i].setText(Integer.toString(change[i]));

			} else {

				tf[i].setText("0");

			}

		}
	}

	public static void main(String[] args) {
		new Ex3();
	}
}

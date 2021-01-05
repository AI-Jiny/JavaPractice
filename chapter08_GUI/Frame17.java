package GUI_Swing;

import java.awt.*;
import javax.swing.*;

class North extends JPanel {// 부품이면서 컨테이너가 될수 있는 특징을 가짐, flowLayout 기본

	public North() {

		setLayout(new GridLayout(1, 1));
		JLabel la = new JLabel("내가 만든 별자리", JLabel.CENTER);
		add(la);
		add(new JTextField(30));// 문장을 입력

	}

}



class Center extends JPanel {

	public Center() {

		setBackground(new Color(0x00F9A567));
		setLayout(null);// 배치관리자가 없는 레이아웃

		int r = (int) (Math.random() * 20 + 1);

		for (int i = 0; i < r; i++) {
			int x = (int) (Math.random() * 500 + 1);
			int y = (int) (Math.random() * 300 + 1);

			JLabel la = new JLabel("*");
			la.setSize(10, 10);
			la.setLocation(x, y);
			la.setOpaque(true);
			la.setForeground(Color.CYAN);
			la.setBackground(Color.BLACK);
			add(la);
			
		}

	}

}

public class Frame17 extends JFrame {

	public Frame17() {

		setTitle("***Twinkle Twinkle little Star***");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(2, 5));
		c.setBackground(new Color(0x00D5D5D5));

		///////////////////////////////////////////////////////
		
		North n = new North();
		n.setBackground(new Color(0x005CD1E5));
		c.add(n, BorderLayout.NORTH);
		
		
		Center cen = new Center();
		cen.setBackground(Color.BLACK);
		c.add(cen, BorderLayout.CENTER);
		
		//////////////////////////////////////////////////////

		setSize(600, 500);
		setLocation(300, 100);
		setVisible(true);

	}

	public static void main(String[] args) {

		Frame17 fr = new Frame17();

	}

}

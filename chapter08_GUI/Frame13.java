package GUI_Swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame13 extends JFrame {

	public Frame13() {

		setTitle("배치관리자가 없는 컨테이너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setBackground(Color.PINK);
		c.setLayout(null);

		JLabel la = new JLabel("즐거운 추석 보내세요 ㄱ*^ㅁ^*ㄴ");
		la.setLocation(130, 50);
		la.setSize(300, 20); // 라벨/버튼 사이즈 설정
		c.add(la);

		for (int i = 1; i <= 9; i++) {
			JButton jb = new JButton(Integer.toString(i));
			jb.setLocation(i*15, i*15);
			jb.setSize(50, 20);
			
			c.add(jb);
		}

		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {

		Frame13 f = new Frame13();

	}

}

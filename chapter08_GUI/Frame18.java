package GUI_Swing;

import java.awt.*;

import javax.swing.*;

//class NPanel extends JPanel {
//
//	public NPanel() {
//
//		setLayout(new FlowLayout(FlowLayout.CENTER));// 배치 위치를 중앙부터로 설정
//		setBackground(Color.BLACK);
//
//		add(new JButton("OPEN"));
//		add(new JButton("READ"));
//		add(new JButton("CLOSE"));
//
//	}
//
//}

class CPanel extends JPanel {

	public CPanel() {

		setLayout(null);// 직접 배치 하겠다
		setBackground(Color.ORANGE);

		JLabel la1 = new JLabel("HELLO");
		setOpaque(true);
		la1.setSize(50, 50);
		la1.setLocation(100, 30);

		add(la1);
		JLabel la2 = new JLabel("***HAPPY HALLOWEEN***");
		la2.setSize(150, 50);
		la2.setLocation(50, 300);
		add(la2);

		JLabel la3 = new JLabel("PLZ SYUDY HARD");
		la3.setSize(150, 50);
		la3.setLocation(15, 250);
		add(la3);
	}

}

public class Frame18 extends JFrame {
	
	CPanel cp;
	NPanel np;
	

	public Frame18() {

		setTitle("***배치관리 혼합응용***");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentpane = getContentPane();
		contentpane.setLayout(new BorderLayout(5, 5));
		contentpane.setBackground(Color.ORANGE);

		NPanel np = new NPanel();
		contentpane.add(np, BorderLayout.NORTH);

		CPanel cp = new CPanel();
		contentpane.add(cp, BorderLayout.CENTER);
		
		
		
		setSize(300, 500);
		setVisible(true);
	}
	
	//내부클래스 생성 - 메소드 위치로 클래스를 작성할 수 있다.
	class NPanel extends JPanel {

		public NPanel() {

			setLayout(new FlowLayout(FlowLayout.CENTER));// 배치 위치를 중앙부터로 설정
			setBackground(Color.BLACK);

			add(new JButton("OPEN"));
			add(new JButton("READ"));
			add(new JButton("CLOSE"));

		}

	}
	
	public static void main(String[] args) {

		Frame18 f = new Frame18();

	}

}

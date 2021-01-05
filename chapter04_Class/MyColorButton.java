package step7_Extends;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyColorButton extends JFrame {

	// 생성자
	public MyColorButton() {

		// 1. 기본설정
		setTitle("내가 처음 만들어보는 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 2. 화면생성
		Container c = getContentPane(); // 싱글톤

		// 3. 레이아웃 설정
		c.setLayout(new GridLayout(1, 10));

		// 4. 컴포넌트 생성
		JButton[] btn = new JButton[10];
		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA, Color.PINK,
				Color.CYAN, Color.WHITE, Color.BLACK };

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);

			// 5. 리스너 생성(현재없음)

			// 6. 화면에 컴포넌트 부착
			c.add(btn[i]);

		}

		// 7. 화면설정
		setSize(500, 500);
		setVisible(true);

	}

	@Override
	public void setDefaultCloseOperation(int operation) {
		// TODO Auto-generated method stub
		super.setDefaultCloseOperation(operation);
	}

	// 실행메소드
	public static void main(String args[]) {

//		MyColorButton m = 
		new MyColorButton();

	}

}

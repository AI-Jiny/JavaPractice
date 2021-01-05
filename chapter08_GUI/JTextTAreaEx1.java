/*
	TextArea
		* 특징 ; 여러줄의 문자열을 입력할 수 있는 입력창 컴포넌트
		* 스크롤바;
			* 기본적으로 지원하지 않는다.
			* 행과열을 지정했다고 해서 입력이 되지않는 것은 아니지만 스크롤바를 해놓지 않으면 볼수가 없다.
			* 스크롤바를 적용하려면 JScrollPane에 삽입해야 한다.
*/
package component;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextTAreaEx1 extends JFrame {

	public JTextTAreaEx1() {

		setTitle("TextArea Learning");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		
		JTextArea text = new JTextArea("Hello", 3, 10);
		text.setBackground(Color.WHITE);
		text.setFont(new Font("고딕체", Font.BOLD, 12));
//		text.setSize(200,100);
//		text.setLocation(40,40);
		
		JScrollPane scroll = new JScrollPane(text);
		scroll.setSize(200,100);
		scroll.setLocation(40,40);
		
		
//		c.add(text);
		c.add(scroll);
		
		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {

		new JTextTAreaEx1();

	}

}

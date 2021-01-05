/*
	Key Event - KeyListener
	
		* 특징 	:	응용프로그램내에 현재 Focus가진 컴포넌트가 키 입력을 독점한다.
					키를 입력하더라도 포커스를 가지고 있지 않다면 key 이벤트를 받을 수 없다.
					포커스를 가진 컴포넌트에서 이벤트가 발생한다.
					
		* 포커스를 주는 방법
			* setVisible(true)	다음 코드 아래에 ...	(임의의 컴포넌트에 포커스를 준다)
			* setFocusable(true)
			* requestFocus()	코드를 작성한다.		(원하는 위치로 컴포넌트 포커스를 설정해준다.)

		* 자판은 두가지로 분류
			* 문자자판(유니코드)	:	KeyPressed -> KeyReleased -> KeyTyped 	(이벤트 세번 발생)
			* 그 외 자판		:		"				"			x		(이벤트 두번 발생)

		* 자판의 3가지 이름
			* 코드값	:	getKeyCode(), KetEvent.가상키
			* 문자값	:	getKetChar()
			* 이름값	:	getKeyText(keyCode)
		
		* 가상키(VK_X)
			* VK_0...........VK_9
			* VK_A...........VK_Z
			* VK_F1..........VK_F24
			* VK_HOME/END/PGUP/PGDN
			* VK_LEFT/RIGHT/UP/DOWN........등등

*/
package listener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class KeyListener1 extends JFrame {

	JTextField t1, t2, t3;

	public KeyListener1() {

		setTitle("KeyListener Study");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel con = new JPanel();
		setContentPane(con);

//////////////////////////////////////////////////////////////////////

		con.setLayout(new GridLayout(2, 3));
		con.add(new JLabel("자판문자", JLabel.CENTER));
		con.add(new JLabel("자판코드", JLabel.CENTER));
		con.add(new JLabel("자판이름", SwingConstants.CENTER));
		// 글자 정렬

		t1 = new JTextField();
		t1.setBackground(Color.PINK);
		t2 = new JTextField();
		t2.setBackground(Color.MAGENTA);
		t3 = new JTextField();
		t3.setBackground(Color.WHITE);

		// 리스너 부착
		t1.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

				char keyChar = e.getKeyChar();
				t1.setText(Character.toString(keyChar));

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		t2.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				int keyCode = e.getKeyCode();
				t2.setText(Integer.toString(keyCode));

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
		t3.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				String name = KeyEvent.getKeyText(e.getKeyCode());
				t3.setText(name);

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

		con.add(t1);
		con.add(t2);
		con.add(t3);

		// 포커스 설정
		setVisible(true);
		con.setFocusable(true);
		con.requestFocus();

/////////////////////////////////////////////////////////////////////		

		setSize(300, 100);
	}

	/*
	 * class MyKeyListener1 extends KeyAdapter {
	 * 
	 * @Override public void keyPressed(KeyEvent e) {
	 * 
	 * // 자판의 문자처리 - getKeyChar() char keyChar = e.getKeyChar();
	 * t1.setText(Character.toString(keyChar)); // char -> string
	 * 
	 * // 자판의 코드처리 - getKeyCode() int keyCode = e.getKeyCode();
	 * t2.setText(Integer.toString(keyCode));
	 * 
	 * // 자판의 이름처리 - getKeyText(keyCode) String s =
	 * KeyEvent.getKeyText(e.getKeyCode()); t3.setText(s);
	 * 
	 * }
	 * 
	 * }
	 */
	public static void main(String[] args) {
		new KeyListener1();
	}

}

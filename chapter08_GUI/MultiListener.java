package listener;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiListener extends JFrame {

	public MultiListener() {

		setTitle("멀티 리스너 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());// 붙일 위치 정해주기
		
		
		
		

		JButton btn = new JButton("Action");
		btn.addActionListener(new MyListener1());
		btn.addMouseListener(new MyListener1());
		btn.addFocusListener(new MyListener1());
		
//		btn.addActionListener(new MyListener2());
		c.add(btn);

		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new MultiListener();
	}

	class MyListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b1 = (JButton) e.getSource();
			b1.setText("또다른 리스너");

		}

	}

}

//독립클래스 리스너
class MyListener1 implements ActionListener, KeyListener, FocusListener, MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

		JButton b3 = (JButton) e.getSource();
		b3.setBackground(Color.CYAN);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b4 = (JButton) e.getSource();
		b4.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b5 = (JButton) e.getSource();
		b5.setText("MouseEvent Test");
		b5.setBackground(Color.BLACK);
	}

	@Override
	public void mousePressed(MouseEvent e) {

		JButton b2 = (JButton) e.getSource();
		if (b2.getText().equals("Action")) {
			b2.setText("액션");
		} else {
			b2.setText("Action");
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void focusGained(FocusEvent e) {

	}

	@Override
	public void focusLost(FocusEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 유니코드 변환

	}

	// 액션리스너
	@Override
	public void actionPerformed(ActionEvent e) {

	}

}

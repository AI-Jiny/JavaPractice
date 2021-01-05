package listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseListener1 extends JFrame {

	public MouseListener1() {

		setTitle("마우스 리스너 학습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentpane = getContentPane();
		contentpane.setLayout(new FlowLayout(FlowLayout.CENTER));

		JButton b = new JButton("MouseEvent");
		b.addMouseListener(new MyMouseListener1());
		contentpane.add(b);
		
		
		
		
		

		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {

		new MouseListener1();

	}
}

class MyMouseListener1 implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// 마우스 클릭할때

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(new Color(0x00FF0000));

	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.cyan);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
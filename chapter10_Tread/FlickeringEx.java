/*
		레이블을 1초에 한번씩 깜빡이는 FlickeringLabel 컴포넌트를 작성하시오
		노란색과 초록색으로 깜빡거림
		
*/
package Thread;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class Flickering implements Runnable {

	JLabel la;

	public Flickering(JLabel la) {

		this.la = la;
		la.setOpaque(true);

		Thread th = new Thread(this);
		th.start();
	}

	public void run() {

		int n = 0;

		while (true) {

			if (n == 0) {
				la.setBackground(Color.GREEN);

			} else {
				
				la.setBackground(Color.YELLOW);
			}

			if (n == 0)
				n = 1;

			else
				n = 0;

			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				return;
			}

		}

	}

}

public class FlickeringEx extends JFrame {

	JLabel la;
	Container c;

	public FlickeringEx() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(new BorderLayout());

		la = new JLabel("Color Change", SwingConstants.CENTER);
		la.setFont(new Font("Arial", Font.BOLD, 30));
		la.setBackground(Color.yellow);
		la.setOpaque(true);

		c.add(la, new BorderLayout().CENTER);

		setSize(300, 300);
		setVisible(true);

		Flickering color = new Flickering(la);

	}

	public static void main(String[] args) {

		new FlickeringEx();

	}

}

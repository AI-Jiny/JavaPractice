package syn;

import java.awt.Color;
import java.awt.Container;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyCanvas extends JPanel {

	public MyCanvas() {

		setLayout(null);
		setBackground(Color.BLACK);

		Pistol pt1 = new Pistol();
		add(pt1);

		Pistol pt2 = new Pistol();
		add(pt2);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int cnt = 0;
				if (e.getKeyChar() == '\n') {
					cnt++;
					for (int i = 1; i <= cnt; i++) {
						// 스레드 호출//////
						PistolTh th1 = new PistolTh(pt1);
						th1.start();
					}
				}
			}
		});
	}
}

//총알////////////////////////
class Pistol extends JLabel {

	public Pistol() {

		setSize(10, 10);
		setOpaque(true);
		setLocation(500, 550);
		setBackground(Color.YELLOW);
	}
}

//총알이 움직이게 하는 스레드///////////
class PistolTh extends Thread {

	JLabel pt;

	public PistolTh(JLabel pt) {
		this.pt = pt;
	}

	public void run() {

		while (pt.getY() >= 0) {

			if (pt.getY() <= 0) { // 화면 상단을 벗어나면
				pt.setVisible(false); // 보이지않게 처리
			}
			pt.setLocation(pt.getX(), pt.getY() - 10);
			pt.repaint();

			try {
				sleep(100);
			} catch (InterruptedException e) {
				return;
			}
		}
		// 벗어나면 처음위치에서 다시 보이게
		pt.setLocation(500, 550);
		pt.setVisible(true);
	}
}

public class PistolEx extends JFrame {

	public PistolEx() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		MyCanvas mc = new MyCanvas();
		c.add(mc);

		setSize(1000, 600);
		setVisible(true);

		mc.requestFocus();

	}

	public static void main(String[] args) {
		new PistolEx();
	}
}

package syn;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyBar extends JLabel {

	int barSize = 0;
	int maxBarSize;

	public MyBar(int maxBarSize) {

		this.maxBarSize = maxBarSize;

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);

		int width = (int) (((double) (this.getWidth()) / maxBarSize) * barSize);

		if (width == 0) {
			return; // 그릴필요없이 빠져나간다.

		}

		g.fillRect(0, 0, width, this.getHeight());

	}

	// 누를때마다 채우는 메소드
	synchronized void fill() {

		if (barSize == maxBarSize) {
			try {
				wait(); // 최대값까지 갔으면 대기

			} catch (InterruptedException e) {
				return;

			}

		}

		// 아직 최대가 아니라면
		barSize++;
		repaint();
		notify(); // 스레드를 깨워놓는다. fill()을 부를때를 대비해서

	}

	// 가만히 있을때 자동으로 감소되는 메소드
	synchronized void consum() {

		if (barSize == 0) {

			try {
				wait();

			} catch (Exception e) {
				return;
			}

		}
		barSize--;
		repaint();
		notify();

	}

}

class ConsumerTh extends Thread {

	MyBar bar;

	public ConsumerTh(MyBar bar) {

		this.bar = bar;
	}

	public void run() {

		while (true) {

			try {
				sleep(200);
				bar.consum();

			} catch (Exception e) {
				return;
			}

		}

	}

}

public class Syn2 extends JFrame {

	public Syn2(String title) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);

		MyBar bar = new MyBar(100);
		bar.setBackground(Color.lightGray);
		bar.setOpaque(true);

		bar.setSize(300, 20);
		bar.setLocation(20, 50);

		c.add(bar);
		c.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();	
			}
		});
		
		setSize(350, 200);
		setVisible(true);

		//키리스너
		c.requestFocus();
		
		//스레드에 MyBar연결
		ConsumerTh th = new ConsumerTh(bar);
		th.start();
		
		
	}

	public static void main(String[] args) {
		new Syn2("Press Any key");
	}
}

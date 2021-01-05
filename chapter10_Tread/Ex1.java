//화면에 "꽃" 글자가 임의의 좌표에 1초마다 계속찍히는 화면 구현
//화면을 마우스로 클릭하면 중지

package Thread;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

class RandomTh extends Thread {

	boolean flag = false;
	Container c;

	public RandomTh(Container c) {
		this.c = c;
	}

	void finish() {
		flag = true;
	}

	public void run() {

		while (true) {

			JLabel la = new JLabel("꽃");
			la.setSize(30, 80);
			la.setForeground(Color.YELLOW);

			int x = (int) (Math.random() * 1300);
			int y = (int) (Math.random() * 700);
			
			la.setLocation(x, y);

			c.add(la);
			c.repaint();

			try {

				sleep(1000);

				if (flag == true) {

					c.removeAll();
					c.repaint();

					return;

				}

			} catch (Exception e) {

				return;
			}

		}

	}

}

public class Ex1 extends JFrame {	
	
	public Ex1() {

		Container c = getContentPane();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setBackground(Color.BLACK);
		c.setLayout(null);

		RandomTh ran = new RandomTh(c);
		
		ran.start();

		c.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				ran.finish();
				
			}
		});	
		
		setSize(1300, 700);
		setVisible(true);
		
	}
	
	

	public static void main(String[] args) {

		new Ex1();

	}

}

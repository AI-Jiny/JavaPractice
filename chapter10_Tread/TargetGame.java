package syn;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TargetGame extends JFrame {

	public TargetGame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 판넬생성
		GameP p = new GameP();
		setContentPane(p);

		// 배경
		ImageIcon img = new ImageIcon(".\\IMG\\Back.jpg");
		JLabel la = new JLabel(img);
		la.setSize(1500, 520);
		la.setLocation(-200, 0);
		p.add(la);

		setSize(1000, 500);
		setResizable(false);// 창크기 고정
		setVisible(true);

		// 게임스타트 메소드 호출
		p.startGame();

	}

	public static void main(String[] args) {
		new TargetGame();

	}

}







//게임 판넬제작
class GameP extends JPanel {
	
	JLabel baseLabel, targetLabel, bulletLabel;
	ImageIcon target;
	TargetTh targetThread = null;

	public GameP() {

		setLayout(null);

		// 총대
		baseLabel = new JLabel();
		baseLabel.setLocation(getWidth(), getHeight());
		baseLabel.setSize(40, 40);
		baseLabel.setOpaque(true);
		baseLabel.setBackground(Color.LIGHT_GRAY);

		// 목표
		target = new ImageIcon(".\\IMG\\AirCraft.png");
		targetLabel = new JLabel(target);
		targetLabel.setSize(target.getIconWidth(), target.getIconHeight());

		// 총알
		bulletLabel = new JLabel();
		bulletLabel.setSize(10, 10);
		bulletLabel.setOpaque(true);
		bulletLabel.setBackground(Color.ORANGE);

		add(baseLabel);
		add(targetLabel);
		add(bulletLabel);

	}

	// 메소드 : 위치값을 설정하고 리스너를 부착해주는 메소드
	void startGame() {

		// 총알, 목표물 초기 위치값 설정
		baseLabel.setLocation(GameP.this.getWidth() / 2 - 20, GameP.this.getHeight() - 30);
		bulletLabel.setLocation(GameP.this.getWidth() / 2 - 5, GameP.this.getHeight() - 40);
		targetLabel.setLocation(0, 30);

		// 목표물 스레드 생성
		targetThread = new TargetTh(targetLabel);
		targetThread.start();
		
		
		

		baseLabel.requestFocus();
		baseLabel.addMouseListener(new MouseAdapter() {
			BulletTh bulletThread = null;

			@Override
			public void mouseClicked(MouseEvent e) {
				// 총알스레드
				if (bulletThread == null || !bulletThread.isAlive()) {
					
					// 총알 스레드가 없거나 죽었다면
					bulletThread = new BulletTh(bulletLabel, targetLabel, targetThread);
					bulletThread.start();

				}
			}
		});

	}

	// 목표물 스레드
	class TargetTh extends Thread {

		JLabel target;

		public TargetTh(JLabel target) {
			this.target = target;
			target.setLocation(0, 30);
			target.getParent().repaint();
		}

		public void run() {

			while (true) {

				int x = target.getX() + 5;
				int y = target.getY();

				if (x > GameP.this.getWidth())
					target.setLocation(-10, 30);

				else
					target.setLocation(x, y);
					target.getParent().repaint();

				try {
					sleep(10);
				} catch (InterruptedException e) {
					target.setLocation(-30, 30);
					target.getParent().repaint();

					try {
						sleep(10);
					} catch (Exception e2) {
						return;
					}
				}
			}
		}
	}

	// 총알스레드
	class BulletTh extends Thread {

		JComponent bullet, target;
		Thread targetThread;

		public BulletTh(JComponent bullet, JComponent target, Thread targetThread) {

			this.bullet = bullet;
			this.target = target;
			this.targetThread = targetThread;

		}

		public void run() {

			while (true) {

				if (hit()) {
					targetThread.interrupt(); // 맞았다면 중지해라
					bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 40);
					return;
				} else {

					int x = bullet.getX();
					int y = bullet.getY() - 5; // 총알이 움직이도록 설정

					if (y < 0) {
						bullet.setLocation(bullet.getParent().getWidth() / 2 - 5, bullet.getParent().getHeight() - 40);
						bullet.repaint();
						return;
					}

					bullet.setLocation(x, y);
					bullet.getParent().repaint();

				}

				try {
					sleep(20);
				} catch (Exception e) {
					return;
				}
			}

		}

		// 총알이 맞았을때
		boolean hit() {

			if (targetCondition(bullet.getX(), bullet.getY())
					|| targetCondition(bullet.getX() + bullet.getWidth() - 1, bullet.getY())
					|| targetCondition(bullet.getX() + bullet.getWidth() - 1, bullet.getY() + bullet.getHeight() - 1)
					|| targetCondition(bullet.getX(), bullet.getY() + bullet.getHeight() - 1))

				return true;
			else
				return false;
		}

		// 총알이 맞았는지 안맞았는지
		boolean targetCondition(int x, int y) {

			if (((target.getX() <= x) && (target.getX() + target.getWidth() - 20 >= x))
					&& (target.getY() + target.getHeight() - 60 >= y)) {

				return true;
			} else {
				return false;
			}
		}

	}
}

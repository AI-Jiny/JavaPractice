package chapter09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Chart extends JFrame {

	Container c;
	// 데이터 저장 배열
	int[] data = { 0, 0, 0, 0 };
	// 각도 저장 배열
	int[] arcAngle = new int[4];
	// 색깔 저장 배열
	Color[] color = { Color.PINK, Color.MAGENTA, Color.ORANGE, Color.GREEN};
	// 과일 이름 저장 배열
	String[] itemName = { "Apple", "Cherry", "Pear", "Kiwi" };
	// 텍스트 입력필드 저장 배열
	JTextField[] tf = new JTextField[4];
	// 차트 판넬 생성
	ChartPanel chartPanel = new ChartPanel();

	public Chart() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new InputPanel(), BorderLayout.NORTH);
		c.add(new ChartPanel(), BorderLayout.CENTER);

		setSize(600, 600);
		setVisible(true);
		
		drawChar();
		

	}

	// 메소드 : 차트를 그려주는 메소드
	void drawChar() {

		// 입력값 합산 처리 : 문자를 숫자로 전환 후 합을 구함
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(tf[i].getText());
			sum += data[i];
		}
		if (sum == 0)
			return;

		// 각도 구하기
		for (int i = 0; i < data.length; i++) {
			arcAngle[i] = (int) Math.round((double) data[i] / (double) sum * 360); // 각도 구하기

		}

		// 구현 값으로 다시 그리기
		chartPanel.repaint();
	}

	// 입력판넬
	class InputPanel extends JPanel {

		public InputPanel() {

			setBackground(Color.LIGHT_GRAY);
			for (int i = 0; i < tf.length; i++) {

				tf[i] = new JTextField("0", 5);
				tf[i].addActionListener(new MyActionListener());
				add(new JLabel(itemName[i]));
				add(tf[i]);

			}

		}

		class MyActionListener implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();

				int n;
				
				try {
					
					n= Integer.parseInt(t.getText());
					
				} catch (NumberFormatException e2) {
					t.setText("0");
					return;
				}
				
				drawChar();
			}

		}

	}

	// 그래프 드로잉 판넬
	class ChartPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			int StartAngle = 0;
			for(int i=0; i<data.length; i++) {
				g.setColor(color[i]);
				g.drawString(itemName[i]+""+Math.round(arcAngle[i]*100/360)+"%",100+i*120, 20);
			}
			
			for(int i = 0; i<data.length; i++) {
				g.setColor(color[i]);
				g.fillArc(150, 50, 200, 200, StartAngle, arcAngle[i]);
				StartAngle =  StartAngle + arcAngle[i];
				repaint();
			}
			
		}

	}

	public static void main(String[] args) {
		new Chart();
	}
}
